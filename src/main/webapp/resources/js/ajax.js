/**
 * 
 */
	$(document).ready(function() {
		$('#validate').click(function() {
		
			var flag = false;
			var user_id = $('#email').val();
			var user_pwd = $('#pwd1').val();
			var user_pwd2 = $('#pwd2').val();
			var user_name = $('#name').val();
			var user_phone = $('#phone').val();
			
			//Ajax 구간
			if(user_email == '' || user_pwd =='' || user_name =='' || user_phone ==''){
	
				alert("빈칸없이 입력하세요");
		
			} else if( user_pwd != user_pwd2){
			
				alert("비밀번호가 일치하지 않습니다");
				
			} else if(user_pwd == user_pwd2){
			
				$.ajax({
				
					data :  {email : user_email, pwd : user_pwd , name : user_name , phone : user_phone },
					type : "post",
					dataType: "json",
					async: false,
					url : '/newFood/join',
					
					success : function(data){
						if (data == 1) {
							alert("회원가입에 성공했습니다.\n마이페이지에서 프로필을 작성해주세요!");
							location.href='/newFood/';
						} else {
							alert("회원가입에 실패했습니다");
							location.href='/newFood/view_join';
						}
					},
					
					error : function(data, textStatus){
						alert('실패');
						location.href='/newFood/view_join';
					},
					
					complete : function(data,textStatus){
					}
				});
				
			}
			return flag;
		});
		
	
		$('.form-control').focusout(function () {
	        var pwd1 = $("#pwd1").val();
	        var pwd2 = $("#pwd2").val();
	  
	        if ( pwd1 != '' && pwd2 == '' ) {
	            null;
	        } else if (pwd1 != "" || pwd2 != "") {
	            if (pwd1 == pwd2) {
	                $("#alert-success").css('display', 'inline-block');
	                $("#alert-danger").css('display', 'none');
	            } else {
	              
	                $("#alert-success").css('display', 'none');
	                $("#alert-danger").css('display', 'inline-block');
	            }
	        }
	    });
		
		$('#emailCheck').click(function(){
			var _email = $("#email").val();
			if (_email == "") {
				alert("ID를 입력하세요");
				return;
			}
			$.ajax({
				type : "post",
				async : true,
				url : "/newFood/emailChk",
				dataType : "json",
				data : {"email" : _email},
				
				success : function(data, textStatus) {
					

					if (data == 1) {
						alert("사용할 수 없는 Email입니다.");
					} else {
						alert("사용할 수 있는 Email입니다.");
					}
					
					
//					if (data == 1) {
//						alert("사용할 수 없는 Email입니다.");
//						$("#validate").css('display', 'none');
//					} else {
//						alert("사용할 수 있는 Email입니다.");
//						$("#validate").css('display', 'inline-block');
//					}
				},
				
				error : function(data) {
					alert("에러가! 발생했습니다.");
					
				},
				
				complete : function(data) {
					//alert("작업을 완료 했습니다");
				}
			}); //end ajax	 
		});
	});