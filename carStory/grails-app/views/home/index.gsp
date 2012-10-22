<!DOCTYPE html>
<html>
<head>
<meta name="viewport"
	content="width=980px, initial-scale=1, maximum-scale=1">
<title>Bootstrap 101 Template</title>
<!-- Bootstrap -->

<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'bootstrap.min.css')}"
	type="text/css">
<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'carStory.css')}" type="text/css">
</head>
<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
}
</style>
<body class="backSilver">

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner backTire">
			<div class="container"></div>
			<!--/.nav-collapse -->
		</div>

	</div>

	<div class="container">
		<div class="row">
			<div class="span6">
				<div class="modern_img_frame modern_two_col_large"></div>

			</div>
			<div class="span6">
				<ul class="thumbnails ">
              <li >
                <div class="thumbnail backGray">
                  <form class="form-horizontal">
  <div class="control-group">
    <label class="control-label" for="inputEmail">Email</label>
    <div class="controls">
      <input type="text" id="inputEmail" placeholder="Email">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="inputPassword">Password</label>
    <div class="controls">
      <input type="password" id="inputPassword" placeholder="Password">
    </div>
  </div>
  <div class="control-group">
    <div class="controls">
      <label class="checkbox">
        <input type="checkbox"> Remember me
        <button type="submit" class="btn">Accedi</button>
      </label>
      
    </div>
  </div>
</form>
                  <div class="caption">
                    <p><a href="#" class="btn btn-primary">Accedi</a> </p>
                  </div>
                </div>
              </li>
             
            </ul>
                </div>

		</div>
		<!-- Main hero unit for a primary marketing message or call to action -->
		<div class="span12">
			<h1>Hello, world!</h1>
			<p>This is a template for a simple marketing or informational
				website. It includes a large callout called the hero unit and three
				supporting pieces of content. Use it as a starting point to create
				something more unique.</p>
			<p>
				<a class="btn btn-primary btn-large">Learn more »</a>
			</p>
		</div>




		<hr>



	</div>
	<!-- /container -->

	<div class="navbar navbar-inverse navbar-fixed-bottom">
		<div class="navbar-inner backTire">
			<div class="container"></div>
			<!--/.nav-collapse -->
		</div>
	</div>




</body>
</body>
<jq:resources />
<script src="${resource(dir:'js', file:'bootstrap.min.js') }"></script>
</html>