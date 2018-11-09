var SUCCESS=0;
$(function(){

	$('#readcode').click(readCode);
	$('#loadbook').click(loadBookForm);
//	$('#checkbook').click(checkBooks);
});

var num;


var bookTemplate = 
	'<tr align="center">'+
	    '<td  width="17%" height="25">[bookname]</td>'+
	    '<td  width="13%" >[borrowTime]</td>'+
	    '<td  width="13%" >[backTime]</td>'+
	    '<td  width="16%" align="center">[pubname]</td>'+
	    '<td  width="10%" align="center">[bookcase]</td>'+
	    '<td  colspan="2" align="center">[booktype]</td>'+
	    '<td  width="10%" align="center"><a href="back/BackBookById.do?bookid=[bookid]&&operator=[operator]&&barcode=[barcode]">归还</a></td>'+
	'</tr>';
function showBooks(books){
	$('#showbooks').empty();
	
	for(var i=0; i < books.length; i++){
		var book=books[i];
		var bookid = book.bookid;
//		console.log("bookid:"+bookid);
		var operator = $('#operator').val();
		var barcode= $('#barcode').val();
		var td =bookTemplate.replace('[bookname]',book.bookname);
		td = td.replace('[borrowTime]',book.borrowTime).replace('[backTime]',book.backTime).
		        replace('[pubname]',book.pubname).replace('[bookcase]',book.bookcase).
		        replace('[booktype]',book.booktype).replace('[bookid]',bookid).replace('[operator]',operator).replace('[barcode]',barcode);
//		console.log(td);
		
		$('#showbooks').append(td);

	}
	
	
}

function loadBookForm(){
	var n = checkinput();
	if(n!=1){
		return;
	}
	var barcode = $('#barcode').val();
	var url = 'back/checkBook.do';
	var data = {"barcode":barcode};
	$.post(url, data, function(result){
		if (result.state == SUCCESS) {
			console.log(result.data);
			var list=result.data;
			showBooks(list);
			if (num-list.length <= 0) {
				alert("您不能再借阅其他图书了!");
				return;
			}
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
	var url="back/checkCode.do";
	var data = {"barcode":barcode};
	$.post(url, data, function(result) {
		if (result.state == SUCCESS) {
			console.log(result);
			// 登录成功以后将ID保存到Cookies中
			var readerId = result.data.id;
			
			console.log('readerId:' + readerId);
			
			setCookie("readerid",readerId);
			
			$('#readername').val(result.data.name);
			$('#readerType').val(result.data.type);
			$('#sex').val(result.data.sex);
			$('#paperType').val(result.data.paperType);
			$('#paperNo').val(result.data.paperNo);
			$('#number').val(result.data.number);
			num = result.data.number;
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

