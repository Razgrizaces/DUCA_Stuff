canvas = document.getElementById('pong');
canvas.width= 640;
canvas.height = 480;
ctx = canvas.getContext('2d');
x = 100;
leftKey = false; rightKey = false;
document.onkeydown = function(evt){
if(evt.keyCode==79) leftKey=true;
if(evt.keyCode==80) rightkey=true;
return false;
};
document.onkeyup = function(evt){
if(evt.keyCode==79) leftKey=false;
if(evt.keyCode==80) rightKey=false;
return false;
};

gameRun = function()
{
ctx.fillStyle = "#000000";
ctx.beginPath();
ctx.rect(0,0,640,480);
ctx.closePath();
ctx.fill();
if(leftKey==true)
{x--;};
if(rightKey==true)
{x++;};
   ctx.fillStyle="#ff0000";
   ctx.beginPath();
   ctx.rect(x,0,100,100);
   ctx.closePath();
   ctx.fill();
};
_intervalid= setInterval(gameRun, 20);
