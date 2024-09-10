fun main ()
{val regularСustomer:Boolean=true
val sum=100000
if(sum<1000)
{ println("сумма покупки составит "+sum+" руб")}
else if(sum<=10000){
    println("сумма покупки "+(if (regularСustomer)(sum-100)*0.99 else sum-100) + " руб")
}
    else println("сумма покупки "+(if (regularСustomer)sum*0.95*0.99 else sum*0.95) + " руб"  )
}

