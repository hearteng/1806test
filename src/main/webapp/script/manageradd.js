var SUCCESS=0;
$(function(){
	$('#add').click(addAction);
	$('#name').blur(checkName);
	$('#pwd').blur(checkPassword);
	$('#pwd1').blur(checkConfirmPassword);
	
});
  
function checkConfirmPassword(){
//	console.log("checkConfirmPassword");
	var pwd = $('#pwd').val();
	var pwd1 = $('#pwd1').val();
	$('#pwd1-msg').empty();
	
	if(pwd1 == "" || pwd!=pwd1){
		console.log("不一致")
		$('#pwd1-msg').append("不一致");
		return false;
	}
		return true;
}
function checkName(){
	var name = $('#name').val();
	var reg = /^\w{3,100}$/;
	$('#name-msg').empty();
	if(!reg.test(name)){
		$('#name-msg').append("过短");
		return false;
	}
	return true;
}
function checkPassword(){
	var pwd = $('#pwd').val();
	var reg = /^\w{3,100}$/;
	$('#pwd-msg').empty();
	if(!reg.test(pwd)){
		$('#pwd-msg').append("过短");
		return false;
	}
	return true;
}

function addAction(){
	var n = checkName()+checkPassword()+checkConfirmPassword();
	if(n!=3){
		return;
	}
	var name = $('#name').val();
	var pwd = $('#pwd').val();
	
	var url="manager/add.do";
	var data = {name:name,password:pwd};
	console.log(data);
	$('#pwd1-msg').empty();
	$.post(url,data,function(result){
		console.log(result);
		if(result.state==SUCCESS){
			var n = result.data.name;
			alert('管理员:'+n+'保存成功');
			$('#back').click();
		}else{
			console.log("false");
			var msg = result.message;
			$('#pwd1-msg').append(msg);			
		}
	});
}

