package Models;


public class Rider {
    String Name;
    String Country;
    int Age;
    double Weight;
    double Height;
    
    public class Record
    {
        int No_Of_Olympic_Medals;
        double TopSpeed;
        int No_Of_National_Level_Records;
        
       public  Record(int o,double s,int n)
        {
            this.No_Of_Olympic_Medals=o;
            this.No_Of_National_Level_Records=n;
            this.TopSpeed=s;
        } 
       public  String DisplayRecords()
        {
              String x="Oylmpic Medals "+No_Of_Olympic_Medals+" "+No_Of_National_Level_Records;
            x+=TopSpeed;
            return x;           
            
        }
        
    }
    
    public Rider(String n,String c,int a,double w,double h)
    {
        this.Name=n;
        this.Country=c;
        this.Age=a;
        this.Height=h;
        this.Weight=w;
        
    }
    
    
    
    public double calBMI()
    {
        class BMI
        {
            double WeightMetric;
            double HeightMetric;
            double BMIMetric()
            {
                double answer=WeightMetric/Math.pow(HeightMetric, 2);
                return answer;
            }
        }
        BMI b=new BMI();
        b.WeightMetric=Weight;
        b.HeightMetric=Height;
        double output=b.BMIMetric();
        return output;
    }
}
