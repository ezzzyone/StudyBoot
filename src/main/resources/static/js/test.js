console.log("start");

$("#btn").click(function(){
 console.log("hahaha");
})

$(".buttons").click(function(){
    console.log("buttons");
   })

   //이벤트 위임
   $("test").on("click","btn2", funtion(){

   })


