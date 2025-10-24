cd C:\MyLabs\Lab1
scp -P 2222 Lab1.java s476941@helios.se.ifmo.ru:~/


ssh -p 2222 s476941@se.ifmo.ru


javac Lab1.java
echo 'Main-Class: Lab1'
jar -cfm Lab1.jar manifest.mf Lab1.class
java -jar Lab1.jar



if(l==6)
        {
            return sin(atan(pow((x-2)/8, 2)));
        }
        if(l==10 || l==12 || l==14 || l==16 || l==18)
        {
            return log(exp(tan(atan((x-2)/8))));
        }
        else{
            return pow(sin(tan(pow((1.0/4)/x, x))), log(abs(asin(exp(-1*abs(x))))));
        }