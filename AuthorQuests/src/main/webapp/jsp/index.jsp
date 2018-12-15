<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 13.11.2018
  Time: 19:21
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
    <jsp:include page="/parts/header.jsp"/>
    <div id="top-banner-and-menu">
        <div class="container">
            <div class="col-xs-12 col-sm-4 col-md-3 sidemenu-holder">
                <!-- ================================== TOP NAVIGATION ================================== -->
                <div class="side-menu animate-dropdown">
                    <div class="head"><i class="fa fa-list"></i> все разделы</div>
                    <nav class="yamm megamenu-horizontal" role="navigation">
                        <ul class="nav">


                            <li class="dropdown menu-item">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Квесты</a>
                                <ul class="dropdown-menu mega-menu">
                                    <li class="yamm-content">
                                        <!-- ================================== MEGAMENU VERTICAL ================================== -->
                                        <div class="row">
                                            <div class="col-xs-12 col-lg-4">
                                                <ul>
                                                    <li><a href="#">1</a></li>
                                                    <li><a href="#">2</a></li>
                                                    <li><a href="#">3</a></li>

                                                </ul>
                                            </div>


                                            <%--<div class="dropdown-banner-holder">--%>
                                                <%--<a href="#"><img alt=""--%>
                                                                 <%--src="assets/images/banners/banner-side.png"/></a>--%>
                                            <%--</div>--%>
                                        </div>
                                        <!-- ================================== MEGAMENU VERTICAL ================================== -->
                                    </li>
                                </ul>
                            </li><!-- /.menu-item -->

                            <li class="dropdown menu-item">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Настольные игры</a>
                                <ul class="dropdown-menu mega-menu">
                                    <li class="yamm-content">
                                        <!-- ================================== MEGAMENU VERTICAL ================================== -->
                                        <div class="row">
                                            <div class="col-xs-12 col-lg-4">
                                                <ul>
                                                    <li><a href="#">1</a></li>
                                                    <li><a href="#">2</a></li>
                                                    <li><a href="#">3</a></li>
                                                    <li><a href="#">4</a></li>
                                                    <li><a href="#">5</a></li>

                                                </ul>
                                            </div>


                                            <%--<div class="dropdown-banner-holder">--%>
                                                <%--<a href="#"><img alt=""--%>
                                                                 <%--src="assets/images/banners/banner-side.png"/></a>--%>
                                            <%--</div>--%>
                                        </div>
                                        <!-- ================================== MEGAMENU VERTICAL ================================== -->
                                    </li>
                                </ul>
                            </li><!-- /.menu-item -->
                        </ul><!-- /.nav -->
                    </nav><!-- /.megamenu-horizontal -->
                </div><!-- /.side-menu -->
                <!-- ================================== TOP NAVIGATION : END ================================== -->
            </div><!-- /.sidemenu-holder -->


        </div><!-- /.container -->
    </div><!-- /#top-banner-and-menu -->

    <!-- ========================================= HOME BANNERS ========================================= -->

    <!-- ========================================= HOME BANNERS : END ========================================= -->


    <!-- ========================================= RECENTLY VIEWED ========================================= -->
    <section id="recently-reviewd" class="wow fadeInUp">
        <div class="container">
            <div class="carousel-holder hover">

                <div class="title-nav">
                    <h2 class="h1">Лучшие товары</h2>
                    <div class="nav-holder">
                        <a href="#prev" data-target="#owl-recently-viewed"
                           class="slider-prev btn-prev fa fa-angle-left"></a>
                        <a href="#next" data-target="#owl-recently-viewed"
                           class="slider-next btn-next fa fa-angle-right"></a>
                    </div>
                </div><!-- /.title-nav -->

                <div id="owl-recently-viewed" class="owl-carousel product-grid-holder">
                    <div class="no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">
                            <div class="ribbon red"><span>sale</span></div>
                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-11.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">1</a>
                                </div>
                                <div class="brand">Квест</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Добавить в корзину</a>
                                </div>
                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->

                    <div class="no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">
                            <div class="ribbon blue"><span>new!</span></div>
                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-12.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">2</a>
                                </div>
                                <div class="brand">Настольные игры</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Добавить в корзину</a>
                                </div>
                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->

                    <div class=" no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">

                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-13.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">3</a>
                                </div>
                                <div class="brand">Настольная игра</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Добавить в корзину</a>
                                </div>

                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->

                    <div class=" no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">
                            <div class="ribbon blue"><span>new!</span></div>
                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-14.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">5</a>
                                </div>
                                <div class="brand">Квесты</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Добавить в корзину</a>
                                </div>
                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->

                    <div class=" no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">
                            <div class="ribbon green"><span>bestseller</span></div>
                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-15.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">3</a>
                                </div>
                                <div class="brand">Квест</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Добавить в корзину</a>
                                </div>

                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->

                    <div class=" no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">

                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-16.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">5</a>
                                </div>
                                <div class="brand">Квесты</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Добавить в корзину</a>
                                </div>

                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->

                    <div class=" no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">

                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-13.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">5</a>
                                </div>
                                <div class="brand">Квесты</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Добавить в корзину</a>
                                </div>

                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->

                    <div class=" no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">
                            <div class="ribbon blue"><span>new!</span></div>
                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-14.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">2</a>
                                </div>
                                <div class="brand">Настольные игры</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Добавить в корзину</a>
                                </div>

                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->
                </div><!-- /#recently-carousel -->

            </div><!-- /.carousel-holder -->
        </div><!-- /.container -->
    </section><!-- /#recently-reviewd -->
    <!-- ========================================= RECENTLY VIEWED : END ========================================= -->


    <!-- ============================================================= FOOTER ============================================================= -->
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

