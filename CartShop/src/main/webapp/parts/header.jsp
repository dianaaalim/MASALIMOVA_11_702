<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 13.11.2018
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<nav class="top-bar animate-dropdown">
    <div class="container">
        <div class="col-xs-12 col-sm-6 no-margin">
            <ul>
                <li><a href="index.html">Home</a></li>

                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#pages">Pages</a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="index.html">Home</a></li>
                        <li><a href="category-grid.html">Category - Grid/List</a></li>
                        <li><a href="single-product.html">Single Product</a></li>
                        <li><a href="cart.html">Shopping Cart</a></li>
                        <li><a href="checkout.html">Checkout</a></li>
                        <li><a href="authentication.html">Login</a></li>
                        <li><a href="sign-up.html">Register</a></li>

                    </ul>
                </li>
            </ul>
        </div><!-- /.col -->

        <div class="col-xs-12 col-sm-6 no-margin">
            <ul class="right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#change-language">English</a>
                    <ul class="dropdown-menu" role="menu">
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Russian</a></li>
                    </ul>
                </li>
                <li><a href="sign-up.html">Register</a></li>
                <li><a href="authentication.html">Login</a></li>
            </ul>
        </div><!-- /.col -->
    </div><!-- /.container -->
</nav><!-- /.top-bar -->
<!-- ============================================================= TOP NAVIGATION : END ============================================================= -->

<!-- ============================================================= HEADER ============================================================= -->
<header>
    <div class="container no-padding">
        <div class="col-xs-12 col-sm-12 col-md-3 logo-holder">
            <!-- ============================================================= LOGO ============================================================= -->
            <div class="logo">
                <!--<img alt="logo" src="assets/images/logo.svg" width="233" height="54"/>-->
                <!--<object id="sp" type="image/svg+xml" data="assets/images/logo.svg" width="233" height="54"></object>-->
                <a href="index.html"><img
                        src="https://preview.ibb.co/cx8Dcq/regions-green-russia.png" alt="regions-green-russia"
                        border="0"></a>
            </div><!-- /.logo -->
            <!-- ============================================================= LOGO : END ============================================================= -->
        </div><!-- /.logo-holder -->

        <div class="col-xs-12 col-sm-12 col-md-6 top-search-holder no-margin">
            <div class="contact-row">
                <div class="phone inline">
                    <i class="fa fa-phone"></i> (+800) 123 456 7890
                </div>
                <div class="contact inline">
                    <i class="fa fa-envelope"></i> contact@<span class="le-color">oursupport.com</span>
                </div>
            </div><!-- /.contact-row -->
            <!-- ============================================================= SEARCH AREA ============================================================= -->
            <div class="search-area">
                <form>
                    <div class="control-group">
                        <input class="search-field" placeholder="Search for item"/>

                        <ul class="categories-filter animate-dropdown">
                            <li class="dropdown">

                                <a class="dropdown-toggle" data-toggle="dropdown" href="category-grid.html">all
                                    categories</a>

                                <ul class="dropdown-menu" role="menu">
                                    <li role="presentation"><a role="menuitem" tabindex="-1"
                                                               href="category-grid.html">Квесты</a></li>
                                    <li role="presentation"><a role="menuitem" tabindex="-1"
                                                               href="category-grid.html">Настольные игры</a></li>

                                </ul>
                            </li>
                        </ul>

                        <a class="search-button" href="#"></a>

                    </div>
                </form>
            </div><!-- /.search-area -->
            <!-- ============================================================= SEARCH AREA : END ============================================================= -->
        </div><!-- /.top-search-holder -->

        <div class="col-xs-12 col-sm-12 col-md-3 top-cart-row no-margin">
            <div class="top-cart-row-container">


                <!-- ============================================================= SHOPPING CART DROPDOWN ============================================================= -->
                <div class="top-cart-holder dropdown animate-dropdown">
                    <div class="basket">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <div class="basket-item-count">
                                <span class="count">3</span>
                                <img src="assets/images/icon-cart.png" alt=""/>
                            </div>

                            <div class="total-price-basket">
                                <span class="lbl">your cart:</span>
                                <span class="total-price">
                                                <span class="sign">$</span><span class="value">3219,00</span>
                                            </span>
                            </div>
                        </a>

                        <ul class="dropdown-menu">
                            <li>
                                <div class="basket-item">
                                    <div class="row">
                                        <div class="col-xs-4 col-sm-4 no-margin text-center">
                                            <div class="thumb">
                                                <img alt="" src="assets/images/products/product-small-01.jpg"/>
                                            </div>
                                        </div>
                                        <div class="col-xs-8 col-sm-8 no-margin">
                                            <div class="title">Blueberry</div>
                                            <div class="price">$270.00</div>
                                        </div>
                                    </div>
                                    <a class="close-btn" href="#"></a>
                                </div>
                            </li>

                            <li>
                                <div class="basket-item">
                                    <div class="row">
                                        <div class="col-xs-4 col-sm-4 no-margin text-center">
                                            <div class="thumb">
                                                <img alt="" src="assets/images/products/product-small-01.jpg"/>
                                            </div>
                                        </div>
                                        <div class="col-xs-8 col-sm-8 no-margin">
                                            <div class="title">Blueberry</div>
                                            <div class="price">$270.00</div>
                                        </div>
                                    </div>
                                    <a class="close-btn" href="#"></a>
                                </div>
                            </li>

                            <li>
                                <div class="basket-item">
                                    <div class="row">
                                        <div class="col-xs-4 col-sm-4 no-margin text-center">
                                            <div class="thumb">
                                                <img alt="" src="assets/images/products/product-small-01.jpg"/>
                                            </div>
                                        </div>
                                        <div class="col-xs-8 col-sm-8 no-margin">
                                            <div class="title">Blueberry</div>
                                            <div class="price">$270.00</div>
                                        </div>
                                    </div>
                                    <a class="close-btn" href="#"></a>
                                </div>
                            </li>


                            <li class="checkout">
                                <div class="basket-item">
                                    <div class="row">
                                        <div class="col-xs-12 col-sm-6">
                                            <a href="cart.html" class="le-button inverse">View cart</a>
                                        </div>
                                        <div class="col-xs-12 col-sm-6">
                                            <a href="checkout.html" class="le-button">Checkout</a>
                                        </div>
                                    </div>
                                </div>
                            </li>

                        </ul>
                    </div><!-- /.basket -->
                </div><!-- /.top-cart-holder -->
            </div><!-- /.top-cart-row-container -->
            <!-- ============================================================= SHOPPING CART DROPDOWN : END ============================================================= -->
        </div><!-- /.top-cart-row -->
    </div><!-- /.container -->
</header>
</body>
</html>
