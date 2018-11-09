var SUCCESS=0;
$(function(){
	$('#login').click(loginAction);
	$('#name').blur(checkName);
	$('#pwd').blur(checkPassword);
	
});
  
function checkName(){
	var name = $('#name').val();
	var reg = /^\w{3,10}$/;
	$('#name-msg').empty();
	if(!reg.test(name)){
		$('#name-msg').append("3~10个字符");
		return false;
	}
	return true;
}
function checkPassword(){
	var pwd = $('#pwd').val();
	var reg = /^\w{2,10}$/;
	$('#pwd-msg').empty();
	if(!reg.test(pwd)){
		$('#pwd-msg').append("3~10个字符");
		return false;
	}
	return true;
}

function loginAction(){
	var name = $('#name').val();
	var pwd  = $('#pwd').val();
	console.log(name+","+pwd);
	//检查用户名和密码的规则
	var n = checkName()+checkPassword();
	if(n!=2){
		return;
	}
	//向服务器发送用户名和密码
	var url = "manager/login.do";
	//data中的key与服务端控制器参数名一致
	//data中的值来源于页面表单中的数据
	var data = {"name":name,"password":pwd};
	$.post(url,data,function(result){
		console.log(result);
		if(result.state==SUCCESS){
			//登录成功,跳转
			console.log("成功");
			//登录成功以后将ID保存到Cookies中
//			var userId = result.data.id;
//			console.log(userId);
			console.log(result.data.name);
			var name = result.data.name;
			if(name=='rob'){
				location.href = 'manager_add.html';
			}
			var nm = name.split("_");
//			console.log(nm);
			if(nm[0] =='j'){
				location.href = 'borrow/borrowBook.do';
			}
			if(nm[0] =='h'){
				location.href = 'back/backBook.do';
			}
			if(nm[0] =='l'){
				location.href = 'book/findAll.do';
			}
			console.log(nm[0]);
			if(nm[0] =='k'){
				location.href = 'reader/findAll.do';
			}
			
//			console.log(nm[0]);
//	location.href = 'edit.html';
		}else{
			//显示错误消息
			var msg = result.message;
			console.log('msg:'+msg);
			$('#name-msg').html(msg);
			
		}
	});
}

