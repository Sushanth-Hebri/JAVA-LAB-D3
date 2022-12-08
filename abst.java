abstract class figure
{
    int x,y;
    figure(int a,int b){
        x=a;
        y=b;
    }
    abstract double area();
}

class rectangle extends figure{
    rectangle(int a,int b){
        super(a,b);}
        double area(){
            return x*y;
        }
    }


class triangle extends figure{
    triangle(int a, int b){
        super(a,b);}
        double area(){
            return 0.5*x*y;
        }
    }

class circle extends figure{
    circle(int a){
        super(a,a);}
        double area(){
            return 3.14*x*x;
        }
    }



class abst{
    public static void main(String args[]){
        rectangle r=new rectangle(10,20);
        triangle t=new triangle(4,5);
        circle c=new circle(3);
        
        figure f;
        
        f=r;
         double a1=f.area();
             System.out.println("area of rectangle:"+a1);
         
           f=t;
         double a2=f.area();
             System.out.println("area of triangle:"+a2);
         
         f=c;
         double a3=f.area();
             System.out.println("area of circle:"+a3); 
     
              
                      
         
    }
}