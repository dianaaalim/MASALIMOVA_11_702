<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 01.11.2018
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <!-- Meta -->
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="keywords" content="MediaCenter, Template, eCommerce">
    <meta name="robots" content="all">

    <title>Author Quest №1</title>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">

    <!-- Customizable CSS -->
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/colors/green.css">
    <link rel="stylesheet" href="assets/css/owl.carousel.css">
    <link rel="stylesheet" href="assets/css/owl.transitions.css">
    <link rel="stylesheet" href="assets/css/animate.min.css">

    <!-- Fonts -->
    <link href='//fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>

    <!-- Icons/Glyphs -->
    <link rel="stylesheet" href="assets/css/font-awesome.min.css">

    <!-- Favicon -->
    <link rel="shortcut icon" href="assets/images/favicon.ico">

    <!-- HTML5 elements and media queries Support for IE8 : HTML5 shim and Respond.js -->
    <!--[if lt IE 9]>
    <script src="assets/js/html5shiv.js"></script>
    <script src="assets/js/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="wrapper">
    <!-- ============================================================= TOP NAVIGATION ============================================================= -->
    <jsp:include page="/parts/header.jsp"/>
    <!-- ============================================================= HEADER : END ============================================================= -->


    <!-- ========================================= MAIN ========================================= -->
    <main id="authentication" class="inner-bottom-md">
        <div class="container">
            <div class="row">

                <div class="col-md">
                    <section class="section register inner-left-xs">
                        <h2 class="bordered">Создать новый аккаунт</h2>
                        <p>Создайте свой собственный аккаунт в Author Quest №1</p>

                        <form role="form" method="post" class="register-form cf-style-1">

                            <div class="field-row">
                                <label>Name</label>
                                <input type="text" name="firstName" placeholder="Имя" class="le-input">
                                <div class="field-row">
                                    <label>Phone</label>
                                    <input type="text" placeholder="+7***-***-**-**" name="phone" class="le-input">
                                </div><!-- /.field-row -->
                                <div class="field-row">
                                    <label>Email</label>
                                    <input type="text" placeholder="qwerty@qwe.qw" name="email" class="le-input">
                                </div><!-- /.field-row -->
                                <div class="field-row">
                                    <label>Password</label>
                                    <input type="password" name="password" class="le-input">
                                </div><!-- /.field-row -->
                                <div class="buttons-holder">
                                    <button type="submit" value="signUp" class="le-button huge">Sign Up</button>
                                </div><!-- /.buttons-holder -->
                            </div>
                        </form>

                        <h2 class="semi-bold">Если Вы зарегестрируетесь сегодня, то получите возможность:</h2>

                        <ul class="list-unstyled list-benefits">
                            <li><i class="fa fa-check primary-color"></i> Купить квесты, которые предствалены в каталоге
                            </li>
                            <li><i class="fa fa-check primary-color"></i> Заказать свой собственный квест</li>
                            <li><i class="fa fa-check primary-color"></i> Сделать подарок любимым(Праздничный квест)
                            </li>
                        </ul>

                    </section><!-- /.register -->

                </div><!-- /.col -->

            </div><!-- /.row -->
        </div><!-- /.container -->
    </main><!-- /.authentication -->
    <!-- ========================================= MAIN : END ========================================= -->

    <jsp:include page="/parts/footer.jsp"/>
    <!-- ============================================================= FOOTER : END ============================================================= -->
</div><!-- /.wrapper -->

<!-- JavaScripts placed at the end of the document so the pages load faster -->
<script src="assets/js/jquery-1.10.2.min.js"></script>
<script src="assets/js/jquery-migrate-1.2.1.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="//maps.google.com/maps/api/js?key=AIzaSyDDZJO4F0d17RnFoi1F2qtw4wn6Wcaqxao&sensor=false&amp;language=en"></script>
<script src="assets/js/gmap3.min.js"></script>
<script src="assets/js/bootstrap-hover-dropdown.min.js"></script>
<script src="assets/js/owl.carousel.min.js"></script>
<script src="assets/js/css_browser_selector.min.js"></script>
<script src="assets/js/echo.min.js"></script>
<script src="assets/js/jquery.easing-1.3.min.js"></script>
<script src="assets/js/bootstrap-slider.min.js"></script>
<script src="assets/js/jquery.raty.min.js"></script>
<script src="assets/js/jquery.prettyPhoto.min.js"></script>
<script src="assets/js/jquery.customSelect.min.js"></script>
<script src="assets/js/wow.min.js"></script>
<script src="assets/js/buttons.js"></script>
<script src="assets/js/scripts.js"></script>
</body>
</html>

