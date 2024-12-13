import java.util.*;

public class StepTracker{
    int activeDays;
    int step_for_active;
    double averageSteps;
    int total_steps;
    int days;
    
    public StepTracker(){
        step_for_active=0;
    }
    public StepTraker(int step_for_active){
        this.step_for_active=step_for_active;
    }
    public int activeDays(){
    {
        return activeDays;
    }
    public void addDailySteps(int x){
        total_steps=total_steps+x;
        days++;
        if(x>=step_for_active){
           activeDays=activeDays+1; 
        }
    }
    public double averageSteps(){
        averageSteps=total_steps/days;
        return averageSteps;
    }
    
    
    
    
    
    
}