var SUCCESS=0;
$(function(){

	$('#readcode').click(readCode);
	$('#loadbook').click(loadBookForm);
	$('#checkbook').click(checkBooks);
//	$('#borrow').click(borrowActivity);
});

function borrowActivity(){
	console.log("borrowActivity");
	$('#hids').empty();
	var bookid = $("#bookname").val();
	console.log(bookid);
	
	if(bookid==undefined || bookid==""||bookid==null){
		alert("请选中一本书");
		return;
	}
	var barcode = $('#barcode').val();
	var operator = $('#operator').val();
	var url = "borrow/BorrowBookById.do";
	var data = {bookid:bookid,operator:operator,barcode:barcode};
//	$.post(url, data, function(result){
//		if (result.state == SUCCESS) {
//			console.log(result.data);
//			var list=result.data;
//			showBooks(list);
//			$('#number').val(num-list.length);
//			console.log("成功");
//		} else {
//			// 显示错误消息
//			var msg = result.message;
//			$('#barcode-msg').html(msg);
//		}
//	});
}





function checkBooks(){
//	console.log('checkBooks');
	
//	$.each($("#hids tr"), function(){     
//       this.style.display = 'block';    
//	});  
	$('#borrowType').hide();
	$('#checkType').show();
	$('#hids').empty();
	$('#showbooks').empty();
	var key = $('#inputkey').val().trim();
	if(key==""){
		alert("请输入查询关键字!");
		$('#inpukey').focus();
		return;
	}
	
	var type = $("input[name='checktype']:checked").val()  
	var url = "borrow/checkBorrowBook.do";
	var data={'type':type,'key':key};
	$('#barcode-msg').empty()
	$.post(url,data,function(result){
		if (result.state == SUCCESS) {
//			console.log("成功");
//			console.log(result.data);
			var list=result.data;
			showBookCheck(list);
		} else {
			// 显示错误消息
			var msg = result.message;
			$('#barcode-msg').html(msg);
		}
	});

}
//var bookCheckType=
//    '<tr  align="center" bgcolor="#F9D16B">'+
//          '<td width="22%" height="25">图书名称</td>'+
//          '<td width="17%">出版社</td>'+
//          '<td width="15%">书的类型</td>'+
//          '<td width="15%">书架</td>'+
//          '<td width="14%">借阅天数</td>'+
//          '<td colspan="2">借阅状态</td>'+
//    '</tr>';
var bookCheckTem = 
	'<tr align="center">'+
	    '<td  width="22%" height="25">[bookname]</td>'+
	    '<td  width="17%" style="padding:5px;">&nbsp;[pubname]</td>'+
	    '<td  width="15%" style="padding:5px;">&nbsp;[booktype]</td>'+
	    '<td  width="15%" align="center">&nbsp;[bookcase]</td>'+
	    '<td  width="14%" align="center">&nbsp;[days]</td>'+
	    '<td  colspan="2"><a href="borrow/BorrowBookById.do?bookid=[bookid]&&operator=[operator]&&barcode=[barcode]">可借</a></td>'+
	'</tr>';

var bookCheckTemborrow = 
	'<tr align="center">'+
	    '<td  width="22%" height="25">[bookname]</td>'+
	    '<td  width="17%" style="padding:5px;">&nbsp;[pubname]</td>'+
	    '<td  width="15%" style="padding:5px;">&nbsp;[booktype]</td>'+
	    '<td  width="15%" align="center">&nbsp;[bookcase]</td>'+
	    '<td  width="14%" align="center">&nbsp;[days]</td>'+
	    '<td  colspan="2">&nbsp;借出</td>'+
	'</tr>';

function showBookCheck(bookChecks){

	for(var i=0; i < bookChecks.length; i++){
		var book = bookChecks[i];
		console.log(book);
		var status = book.bookstatus;
		var bookid = book.bookId;
		var operator = $('#operator').val();
		var barcode= $('#barcode').val();
		var td=' ';
		if(status == 1){
			var td = bookCheckTemborrow;
		}
		if(status == 0){
			var td = bookCheckTem;
		}
		
		td = td.replace('[bookname]',book.bookname).replace('[days]',book.days).
		        replace('[pubname]',book.pubname).replace('[bookcase]',book.bookcase).
		        replace('[booktype]',book.booktype).replace('[bookid]',bookid).replace('[operator]',operator).replace('[barcode]',barcode);
		console.log(td);
		$('#hids').append(td);
	}
}

var num;

var bookTemplate = 
	'<tr align="center">'+
	    '<td  width="29%" height="25">&nbsp;[bookname]</td>'+
	    '<td  width="13%" style="padding:5px;">&nbsp;[borrowTime]</td>'+
	    '<td  width="14% style="padding:5px;">&nbsp;[backTime]</td>'+
	    '<td  width="17% align="center">&nbsp;[pubname]</td>'+
	    '<td  width="14% align="center">&nbsp;[bookcase]</td>'+
	    '<td  colspan="2">&nbsp;[booktype]</td>'+
	'</tr>';

function showBooks(books){
	$('#showbooks').empty();
	
	for(var i=0; i < books.length; i++){
		var book=books[i];
		var td =bookTemplate.replace('[bookname]',book.bookname);
		td = td.replace('[borrowTime]',book.borrowTime).replace('[backTime]',book.backTime).
		        replace('[pubname]',book.pubname).replace('[bookcase]',book.bookcase).
		        replace('[booktype]',book.booktype);
//		console.log(td);
		$('#showbooks').append(td);
	}
}

function loadBookForm(){
	
	$('#hids').empty();
	$('#borrowType').show();
	$('#checkType').hide();
	var n = checkinput();
	if(n!=1){
		return;
	}
	var barcode = $('#barcode').val();
	var url = 'borrow/checkBook.do';
	var data = {"barcode":barcode};
	$.post(url, data, function(result){
		if (result.state == SUCCESS) {
			console.log(result.data);
			var list=result.data;
			showBooks(list);
			$('#number').val(num-list.length);
//			console.log("成功");
		} else {
			// 显示错误消息
			var msg = result.message;
			$('#barcode-msg').html(msg);
		}
	});
}


function readCode(){
	var n = checkinput();
	if(n!=1){
		return;
	}
	var barcode = $('#barcode').val();
	var url="borrow/checkCode.do";
	var data = {"barcode":barcode};
	$.post(url, data, function(result) {
		if (result.state == SUCCESS) {
//			console.log(result);
			// 登录成功以后将ID保存到Cookies中
			var userId = result.data.id;
//			console.log('userId:' + userId);
			$('#readername').val(result.data.name);
			$('#readerType').val(result.data.type);
			$('#sex').val(result.data.sex);
			$('#paperType').val(result.data.paperType);
			$('#paperNo').val(result.data.paperNo);
			$('#number').val(result.data.number);
			num = result.data.number;
			if (num <= 0) {
				alert("您不能再借阅其他图书了!");
				return;
			}
		} else {
			// 显示错误消息
			var msg = result.message;
			$('#barcode-msg').html(msg);
		}
	});
}


function checkinput(){
	var barcode = $('#barcode').val().trim();
	if(barcode==""){
		alert("请输入读者条形码!");
		$('#readcode').focus();
		return false;
	}
	return true;
}

