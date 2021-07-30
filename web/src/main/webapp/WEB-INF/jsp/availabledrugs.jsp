<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page errorPage = "error.jsp" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
 
 <!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />

    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <link rel="stylesheet" href="style/index.css" />
    <!-- <link rel="stylesheet" href="stylepopupbro.css" /> -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    <title>Mail Order Pharmacy</title>
    <style type="text/css">
    .flip-card {
  background-color: transparent;
  width: 300px;
  height: 300px;
  perspective: 1000px;
  margin-right: 5px;
}

.flip-card-inner {
  position: relative;
  width: 100%;
  height: 100%;
  text-align: center;
  transition: transform 0.6s;
  transform-style: preserve-3d;
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
}



.flip-card:hover .flip-card-inner {
  transform: rotateY(180deg);
}

.flip-card-front, .flip-card-back {
  position: absolute;
  width: 100%;
  height: 100%;
  -webkit-backface-visibility: hidden;
  backface-visibility: hidden;
}

.flip-card-front {
  background-color: #bbb;
  color: black;
}

.flip-card-back {
  background-color: #2980b9;
  color: white;
  transform: rotateY(180deg);
}
    </style>
</head>

<body>



    <nav class="navbar navbar-inverse ">
        <a href="home" class="navbar-brand" ><img width="60px" height="60px" src="images/lo2.png">Mail Order Pharmacy</a>

     
        
        		<div class="dropdown">
  <button class="btn btn-dark dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
 Services
  </button>
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <a class="dropdown-item" href="supportedDrugs">Available Drugs</a>
    <a class="dropdown-item" href="search">Search Drugs</a>
    <a class="dropdown-item" href="prescriptionform">Subscribe</a>
      <a class="dropdown-item" href="subscriptions">Subscriptions</a> 
          <a class="dropdown-item" href="/webportal/getAllRefill">Refill Status</a> 
           <a class="dropdown-item"  href="refillDateEntry">Refill Due Date</a>
            <a class="dropdown-item" href="logout">Logout</a>
  </div>
</div>
    </nav>

    
     
    <br><br><br><br><br>
    <div>
    <h1 class="center "style="color:#000000;"><b>INVENTORY</b></h1>
    </div>
	<br><br>
	<section id="services">
        <div class="container" >
            <div class="row">
                <c:forEach items="${drugList}" var="itr">

                    <div class="col-4">
                        <div class="flip-card-inner" >
                            <div class="">

                              
                                
                                <h1 style="color:#00FFBF;background-color:#36454F"><b>${itr.drugName}</b></h1><br>
                                <!-- <marquee width="60%" direction="down" height="100px" Scrollamount=2 onMouseOver="this.stop()" onMouseOut="this.start()">-->
                                <h3>Manufactured by: ${itr.manufacturer}</h3><br>
                                <h3>Manufacture Date: ${itr.manufactureDate}</h3><br>
                                <h3>Expiry Date: ${itr.expiryDate}</h3><br>
                                  </marquee>

                         

                                    <h1  style="color: #00FFBF;background-color:#36454F"><b>Availability</b></h1><br>
                                  <!--  <marquee width="60%" direction="down" height="100px"  Scrollamount=2 onMouseOver="this.stop()" onMouseOut="this.start()"> -->
                                <c:forEach items="${itr.druglocationQuantities}" var="itr1">
                                    <h3>${itr1.location} : ${itr1.quantity}</h3><br>
                                  
                                </c:forEach>
                                  </marquee>
                            </div>
                        </div>
                    </div>
                    
                    <br>



                </c:forEach>
            </div>
        </div>
    </section>
  

    <br><br><br><br>


    <script>
        function openNav() {
document.getElementById("mySidebar").style.width = "300px";


}

/* Set the width of the sidebar to 0 and the left margin of the page content to 0 */
function closeNav() {
document.getElementById("mySidebar").style.width = "0";

}
    </script>
    
    
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
	
	<style>
body {
  background-image: url('images/bg3.jpeg');
   background-repeat: no-repeat;
      background-size: 100% 100%;
}
</style>
</body>

</html>