


 class Employee {
    private int baseHours = 40;
    private double baseSalary = 40000.0;
    private int baseVacationDays = 10;
    private String baseVacationForm = "yellow";
        
    public int getHours() 
    {
        return baseHours;                
    }

    public double getSalary() 
    {
        return baseSalary;              
    }

    public int getVacationDays() 
    {
        return baseVacationDays;        
    }

    public String getVacationForm() 
    {
        return baseVacationForm;         
    }
        
        
    public final void setBaseHours(int hours) 
    {
        this.baseHours = hours;
    }
    public final void setBaseSalary(double salary) 
    {
        this.baseSalary = salary;
    }
    public final void setBaseVacationDays(int days) 
    {
        this.baseVacationDays = days;
    }
    public final void setBaseVacationForm(String form) 
    {
        this.baseVacationForm = form;
    }
}
    public class Janitor extends Employee {
        public int getHours() {
            return 2 * super.getHours();
        }
        
        public double getSalary() {
            return super.getSalary() - 10000;
        }
        
        public int getVacationDays() {
            return super.getVacationDays() / 2;
        }
        
        public void clean() {
            System.out.println("Workin' for the man.");
        }
    
        public static void main(String[] args) {
    
            Janitor janitor= new Janitor();
            int a=janitor.getHours();
            double b=janitor.getSalary();
            int c=janitor.getVacationDays();
            String S=janitor.getVacationForm();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(S);
        }
    }   

