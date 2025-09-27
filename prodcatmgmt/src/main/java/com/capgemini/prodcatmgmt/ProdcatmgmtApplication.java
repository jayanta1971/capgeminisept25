package com.capgemini.prodcatmgmt;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

 
import com.capgemini.prodcatmgmt.entity.ProdCat;
import com.capgemini.prodcatmgmt.service.ProdCatService;

@SpringBootApplication
public class ProdcatmgmtApplication  implements CommandLineRunner{

	@Autowired
	ApplicationContext applicationContext;
	@Autowired
	ProdCatService prodCatService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProdcatmgmtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 
		int option=0;
    	Scanner sc= new Scanner(System.in);
    	do {
		        System.out.println( "----Menu----" );
		        System.out.println( "----1. Save----" );
		        System.out.println( "----2. Find By Id----" );
		        System.out.println( "----3. Find All Categories----" );
		        System.out.println( "----4. Delete By Id----" );
		        System.out.println( "----5. Update----" );
		        System.out.println( "----6. Exit----" );
		        option=sc.nextInt();
		        if(option==1)
		        {
		        	save();
		        }else if(option==2)
		        {
		        	
		        	ProdCat prodCat=findById();
		        	System.out.println(prodCat);
		        }
		        else if(option==3)
		        {
		        	
		        	List<ProdCat> list=findAll();
		        	System.out.println(list);
		        }
		        else if(option==4)
		        {
		        	
		        	 deleteById();
		        }
		        else if(option==5)
		        {
		        	
		        	 save();
		        }
		        
		        
		        
    	}while(option!=6);

	}
	
	public  void save()
    {
    	Scanner sc= new Scanner(System.in);
        System.out.print( "Please enter Category Name :"  );
        String prodCatName=sc.nextLine();
        ProdCat prodCat= new ProdCat(prodCatName);
        prodCatService.save(prodCat);
        
          
    }
	public  ProdCat findById()
	{
		Scanner sc= new Scanner(System.in);
        System.out.print( "Please enter id :"  );
        int id=sc.nextInt();
		return prodCatService.findById(id);
	}
	public  List<ProdCat> findAll()
	{
		return prodCatService.findAll();
		
	}
	public  void  deleteById()
	{
		Scanner sc= new Scanner(System.in);
        System.out.print( "Please enter id :"  );
        int id=sc.nextInt();
		  prodCatService.deleteById(id);
	}
//	public  void update()
//    {
//    	Scanner sc= new Scanner(System.in);
//    	System.out.print( "Please enter id :"  );
//        int id=sc.nextInt();
//        sc.nextLine();
//        System.out.println( "Please enter Category Name :"  );
//        String prodCatName=sc.nextLine();
//        ProdCat prodCat= new ProdCat(id,prodCatName);
//        prodCatService.update(prodCat);
//        
//          
//    }
}
