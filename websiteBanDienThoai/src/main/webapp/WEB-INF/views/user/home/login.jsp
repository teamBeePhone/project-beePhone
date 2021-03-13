<%@ page pageEncoding="utf-8"%>
<!--  content -->
<!-- catg header banner section -->
<section id="aa-catg-head-banner">
<img src="/static/assets/images/archive-banner.png" alt="banner blog">
  <div class="aa-catg-head-banner-area">
   <div class="container">
    <div class="aa-catg-head-banner-content">
      <h2>Đăng nhập</h2>
      <ol class="breadcrumb">
        <li><a href="index.html">Trang chủ</a></li>                   
        <li style="color:#fff">Đăng nhập</li>
      </ol>
    </div>
   </div>
 </div>
</section>
<!-- / catg header banner section -->

<!-- Cart view section -->
<section id="aa-myaccount">
 <div class="container">
   <div class="row">
     <div class="col-md-12">
      <div class="aa-myaccount-area">         
          <div class="row">
            <div class="col-md-8 col-md-push-2">
              <div class="aa-myaccount-login">
              <h4>Đăng nhập</h4>
               <form class="aa-login-form" name="loginform" onsubmit="validate();" action="" method="post">
                <label for="">Username<span>*</span></label>
                 <input type="text" placeholder="Username" name="username">
                 <label for="">Mật khẩu<span>*</span></label>
                  <input type="password" placeholder="Password" name="password">
                  <p class="rememberme" style="display: block"><input type="checkbox" id="rememberme"> Ghi nhớ </p> 
   
                  <p style="color:red; display:block">Thông báo lỗi
                  </p>
                   <button type="submit" class="aa-browse-btn">Đăng nhập</button>
                      
                </form>
              </div>
            </div>
          </div>          
       </div>
     </div>
   </div>
 </div>
</section>
<!-- / Cart view section -->

<!--  end content-->
 <script>
      var date = new Date();
      var day = date.getDate();
      var month = date.getMonth() + 1;
      var year = date.getFullYear();
      if (month < 10) month = "0" + month;
      if (day < 10) day = "0" + day;
      var today = year + "-" + month + "-" + day;
      document.getElementById('the-date').value = today;
</script>