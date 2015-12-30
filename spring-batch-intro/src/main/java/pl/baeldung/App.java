package pl.baeldung;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.JobFactory;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {



    public static void main(String[] args) {
        // Spring Java config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SpringConfig.class);
        context.register(SpringBatchConfig.class);
        context.refresh();

        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");

        JobBuilderFactory jobBuilderFactory = context.getBean(JobBuilderFactory.class);
        Step step = (Step) context.getBean("step1");


        System.out.println("Starting the batch job");
        try {
            Job test1 = jobBuilderFactory.get("terst1111").start(step).build();
            JobExecution execution = jobLauncher.run(test1, new JobParameters());
            System.out.println(execution.getJobConfigurationName() + " Job Status : " + execution.getStatus());
            System.out.println("Job completed");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Job failed");
        }
    }
}
