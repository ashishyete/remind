<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">

<title>Login-Form</title>
<meta name="description" content="">
<meta name="author" content="">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<link rel="stylesheet" href="../css/jquery.validation.css">

<script src="../js/jquery-1.8.3.js"></script>
<script src="../js/jquery.validation.js"></script>

</head>
<body>
	<table style="width: 100%">
		<tr>
			<td width="25%"></td>
			<td width="50%" align="center">
				<div>&nbsp;</div>
				<div>&nbsp;</div>
				<div>&nbsp;</div>
				<div>&nbsp;</div>
				<form id="form-signup_v1" name="form-signup_v1" method="POST"
					class="validation-form-container" action="/LoginController">

					<div class="field">
						<label><h1>Login</h1></label>
						<div class="ui left labeled input"></div>
					</div>

					<div class="field">
						<label for="signup_v1-email">Email</label>
						<div class="ui left labeled input">

							<input id="signup_v1-email" name="email" type="text"
								data-validation="[EMAIL]">

							<div class="ui corner label">
								<i class="asterisk icon">*</i>
							</div>
						</div>
					</div>
					<div class="field">
						<label for="signup_v1-password">Password</label>
						<div class="ui left labeled input">

							<input id="signup_v1-password" name="password" type="password"
								data-validation="[L>=6]"
								data-validation-message="$ must be at least 6 characters">

							<div class="ui corner label">
								<i class="asterisk icon">*</i>
							</div>
						</div>
					</div>
					<input type="submit" class="ui blue submit button" value="Login">
					&nbsp;&nbsp;&nbsp;<input type="reset" class="ui blue submit button"
						value="Clear">
					<div>&nbsp;</div>
					<div align="left">
						<a href="views/ForgotPassword.jsp"><button id="prefill-signup_v1"
								type="button" class="ui mini basic button">
								Forgot Password ?</button></a>
					</div>
					<div align="right">
						<a href="views/SignUp.jsp"><button id="prefill-signup_v1"
								type="button" class="ui mini basic button">
								SignUp!</button></a>
					</div>
				</form>
			</td>
			<td width="25%"></td>
		</tr>
	</table>

	<script>
		$('#form-signup_v1').validate({
			submitHandler : {
				settings : {
					inputContainer : '.field'
				},
				callback : {
					onBeforeSubmit : function(node) {

						myBeforeSubmitFunction(':D', ':)', node);

					},
					onSubmit : function(node) {

						console.log('#' + node.id + ' has a submit override.');

						//node.submit();

					}
				}
			},
			debug : true
		});

		function myBeforeSubmitFunction(a, b, node) {

			console.log(a, b);

			$(node).find('input:not([type="submit"]), select, textarea').attr(
					'readonly', 'true');
			$(node).append('<div class="ui active loader"></div>');

		}
	</script>

</body>
</html>