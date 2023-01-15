package coml.jsp.thane.project.vehical_Hierarchy;



import java.util.InputMismatchException;  //ImportException pacakage import
import java.util.Scanner; ///SCANNER CLASS ADDRESS WHERE WE STORED

interface I1 // Here interface used
{
	abstract public void login(); // abstract methods (body)
}

class vehicle implements I1     // implementation used           // not required data is not showing         //inheritance achieves
{
	private String numberPlate = "AA XX AA XXXX";       // Data Hiding achieves (Encapsulation)
			String name;  	//Non-static variable
			String price; 	//Non-static variable
			String color1; 	//Non-static variable
			String color2;	//Non-static variable
			String color3; 	//Non-static variable
	
	public void login() //body
	{
		System.out.println("for inoformation of our showrow we have provided a link below:" + "\n" + "link: www.youtube.com");
	}


	public vehicle(String name, String price, String color1, String color2, String color3) //super class constructor
	{
		this.name = name;
		this.price = price;
		this.color1 = color1;
		this.color2 = color2;
		this.color3 = color3;
	}

	public void details() //details method throught printing output
	{
		System.out.println("BRAND NAME         :" + name);
		System.out.println("PRICE              :" + price + "/-");
		System.out.println("COLOR OPTIONS      :" + color1 + ", " + color2 + ", " + color3 + ", ");
	}

	public String getNumberplate() // getter method
	{
		return numberPlate;
	}

	public void setnumberPlate(String numberPlate) // setter method
	{
		this.numberPlate = numberPlate;
	}
}

class twoWheeler extends vehicle    //inheritance achieves
{
	String engineDisplacement; 	//non-static variable
	String maxPower; 			//non-static variable
	String gearBox; 			//non-static variable
	String wheelsType; 			//non-static variable

	public twoWheeler(String name, String price, String color1, String color2, String color3, String engineDisplacement,String maxPower, String gearBox, String wheelsType) 
	{
		super(name, price, color1, color2, color3);    //calling super class constructor
		this.engineDisplacement = engineDisplacement;
		this.maxPower = maxPower;
		this.gearBox = gearBox;
		this.wheelsType = wheelsType;
	}

	public void details() 
	{
		super.details(); //calling super class method details
		System.out.println("ENGINE DISPLACEMENT:" + engineDisplacement);
		System.out.println("MAX. POWER         :" + maxPower);
		System.out.println("GEAR BOX           :" + gearBox);
		System.out.println("WHEELS TYPE        :" + wheelsType);
	}
}

class fuelVarient extends twoWheeler //inheritance achieves
{
	String fuelType; 				//non-static variable
	String fuelTankCapacity; 		//non-static variable
	String average;					//non-static variable

	public fuelVarient(String name, String price, String color1, String color2, String color3,String engineDisplacement, String maxPower, String gearBox, String wheelsType, String fuelType,String fuelTankCapacity, String average)
	{
		super(name, price, color1, color2, color3, engineDisplacement, maxPower, gearBox, wheelsType); //calling twoWheeler constructor 
		this.fuelType = fuelType;
		this.fuelTankCapacity = fuelTankCapacity;
		this.average = average;
	}

	public void details() 
	{
		super.details();
		System.out.println("FUEL TYPE          :" + fuelType);
		System.out.println("FUEL TANK CAPACITY :" + fuelTankCapacity);
		System.out.println("AVERAGE            :" + average);
	}
}

class companyVehicle extends fuelVarient  //inheritance achieves
{
	String vehicleCompanyName; //non-static variable
	String warranty; 		   //non-static variable
	String companyName;        //non-static variable

	public companyVehicle(String name, String price, String color1, String color2, String color3,String engineDisplacement, String maxPower, String gearBox, String wheelsType, String fuelType,String fuelTankCapacity, String average, String vehicleCompanyName, String warranty, String companyName) 
	{
		super(companyName, price, color1, color2, color3, engineDisplacement, maxPower, gearBox, wheelsType, fuelType,fuelTankCapacity, average); //calling twoWheeler constructor 
		this.vehicleCompanyName = vehicleCompanyName;
		this.warranty = warranty;
		this.companyName = companyName;
	}

	public void details() 
	{
		super.details();
		System.out.println("COMPANY NAME       :" + vehicleCompanyName);
		System.out.println("WARRANTY           :" + warranty);
		System.out.println("COMPANY NAME       :" + companyName);
	}
}

class vehicleModel extends companyVehicle //inheritance achieves
{
	String vehicleModel;   //non-static variable  
	String vehicleInfo;    //non-static variable

	public vehicleModel(String name, String price, String color1, String color2, String color3,String engineDisplacement, String maxPower, String gearBox, String wheelsType, String fuelType,String fuelTankCapacity, String average, String vehicleCompanyName, String warranty, String companyName,String vehicleModel, String vehicleInfo) 
	{
		super(name, price, color1, color2, color3, engineDisplacement, maxPower, gearBox, wheelsType, fuelType,fuelTankCapacity, average, vehicleCompanyName, warranty, companyName); //calling twoWheeler constructor 
		this.vehicleModel = vehicleModel;
		this.vehicleInfo = vehicleInfo;
	}

	public void details() 
	{
		super.details();
		System.out.println("VEHICLE MODEL      :" + vehicleModel);
		System.out.println("VEHICLE INFORMATION:" + vehicleInfo);
	}
}





class fourWheeler extends vehicle     //inheritance achieves
{
	String companyName;   //non-static variable

	public fourWheeler(String name, String price, String color1, String color2, String color3, String companyName)
	{
		super(name, price, color1, color2, color3);   //calling super class constructor
		this.companyName = companyName;
	}

	public void details() 
	{
		super.details();
		System.out.println("COMPANY NAME       :" + companyName);		
	}
}

class a extends fourWheeler            //inheritance achieves
{
	String gearBox;              //non-static variable
	String fuelType; 		     //non-static variable
	String average;  			 //non-static variable
	String fuelTankCapacity; 	 //non-static variable


	public a(String name, String price, String color1, String color2, String color3, String companyName,String gearBox,String fuelType,String average,String fuelTankCapacity ) 
	{
		super(name, price, color1, color2, color3, companyName);   //calling super class constructor
		this.gearBox = gearBox;
		this.fuelType = fuelType;
		this.average = average;
		this.fuelTankCapacity = fuelTankCapacity;
	}

	public void details() 
	{
		super.details();		
		System.out.println("GEAR BOX           :" + gearBox);
		System.out.println("FUEL TYPE          :" + fuelType);
		System.out.println("AVERAGE            :" + average);
		System.out.println("FUEL TANK CAPACITY :" + fuelTankCapacity);
	}
}

class vehicleINFO extends a      //inheritance achieves
{
	    
	String model;                   //non-static variable
	String numberOfCylinder;  		//non-static variable
	String maxTorque;   			//non-static variable
	String maxPower;   				//non-static variable
	String sizeOfWheel;    			//non-static variable
	String SeatingCapacity;    		//non-static variable
	String braking;    				//non-static variable
	String noiseCancellation;   	//non-static variable
	String warranty;   				//non-static variable
	
	
	public vehicleINFO (String name,String price,String color1, String color2,String color3, String companyName, String gearBox, String fuelType, String fuleVarient,String fuelTankCapacity,String model,String numberOfCylinder, String maxTorque,String maxPower, String sizeOfWheel, String SeatingCapacity, String braking, String noiseCancellation,String warranty) 
	{
		super(name, price, color1, color2, color3, companyName, gearBox, fuelType, warranty, fuelTankCapacity);	//calling super class constructor	
		this.model = model;
		this.numberOfCylinder = numberOfCylinder;
		this.maxTorque=maxTorque;
		this.maxPower=maxPower;
		this.sizeOfWheel=sizeOfWheel;
		this.SeatingCapacity=SeatingCapacity;
		this.braking=braking;
		this.noiseCancellation=noiseCancellation;
		this.warranty=warranty;
	}

	public void details() 
	{
		super.details();		
		System.out.println("MODEL              :" + model);
		System.out.println("NUMBER OF CYLINDER :" + numberOfCylinder);
		System.out.println("MAX. TORQUE        :" + maxTorque);
		System.out.println("MAX. POWER         :" + maxPower);
		System.out.println("SIZE OF WHEEL      :" + sizeOfWheel);
		System.out.println("SEATING CAPACITY   :" + SeatingCapacity);
		System.out.println("BRAKING            :" + braking);
		System.out.println("NOISE CANCELLLATION:" + noiseCancellation);
		System.out.println("WARRANTY           :" + warranty);
	}

}

class threeWheeler extends vehicle           //inheritance achieves
{
	String engineDisplacement;  //non-static variable
	String maxPower;            //non-static variable
	String gearBox;    			//non-static variable
	String wheelsType;   		//non-static variable
	String fuelType;    		//non-static variable
	String fuelTankCapacity;    //non-static variable
	String average;    			//non-static variable
	String vehicleCompanyName;  //non-static variable
	String warranty;       		//non-static variable
	String companyName;   		//non-static variable
	String vehicleModel;   		//non-static variable
	String vehicleInfo;   		//non-static variable

	public threeWheeler(String name, String price, String color1, String color2, String color3,String engineDisplacement, String maxPower, String gearBox, String wheelsType, String fuelType,String fuelTankCapacity, String average, String vehicleCompanyName, String warranty, String companyName,String vehicleModel, String vehicleInfo)
	{
		super(companyName, price, color1, color2, color3); //calling super class constructor	
		this.engineDisplacement = engineDisplacement;
		this.maxPower = maxPower;
		this.gearBox = gearBox;
		this.wheelsType = wheelsType;
		this.fuelType = fuelType;
		this.fuelTankCapacity = fuelTankCapacity;
		this.average = average;
		this.vehicleCompanyName = vehicleCompanyName;
		this.warranty = warranty;
		this.companyName = companyName;
		this.vehicleModel = vehicleModel;
		this.vehicleInfo = vehicleInfo;
	}

	public void details() 
	{
		super.details();
		System.out.println("ENGINE DISPLACEMENT:" + engineDisplacement);
		System.out.println("MAX POWER          :" + maxPower);
		System.out.println("GEAR BOX           :" + gearBox);
		System.out.println("WHEELS TYPE        :" + wheelsType);
		System.out.println("FUEL TYPE          :" + fuelType);
		System.out.println("FUEL TANK CAPACITY :" + fuelTankCapacity);
		System.out.println("AVERAGE            :" + average);
		System.out.println("VEHICLE COMPANY NAME:" + vehicleCompanyName);
		System.out.println("WARRANTY           :" + warranty);
		System.out.println("COMPANY NAME       :" + companyName);
		System.out.println("VEHICLE MODEL      :" + vehicleModel);
		System.out.println("VEHICLE INFO       :" + vehicleInfo);

	}
}

class sixWheeler extends vehicle              //inheritance achieves
{
	String engineDisplacement;       //non-static variable
	String maxPower;   				 //non-static variable
	String gearBox;    				 //non-static variable
	String wheelsType;               //non-static variable
	String fuelType;                 //non-static variable
	String fuelTankCapacity;         //non-static variable
	String average;                  //non-static variable
	String vehicleCompanyName;       //non-static variable
	String warranty;                 //non-static variable
	String companyName;              //non-static variable
	String vehicleModel;             //non-static variable
	String vehicleInfo;              //non-static variable

	public sixWheeler(String name, String price, String color1, String color2, String color3, String engineDisplacement,String maxPower, String gearBox, String wheelsType, String fuelType, String fuelTankCapacity,String average, String vehicleCompanyName, String warranty, String companyName, String vehicleModel,String vehicleInfo) 
	{
		super(companyName, price, color1, color2, color3);  //calling super class constructor	
		this.engineDisplacement = engineDisplacement;
		this.maxPower = maxPower;
		this.gearBox = gearBox;
		this.wheelsType = wheelsType;
		this.fuelType = fuelType;
		this.fuelTankCapacity = fuelTankCapacity;
		this.average = average;
		this.vehicleCompanyName = vehicleCompanyName;
		this.warranty = warranty;
		this.companyName = companyName;
		this.vehicleModel = vehicleModel;
		this.vehicleInfo = vehicleInfo;
	}

	public void details() 
	{
		super.details();
		System.out.println("ENGINE DISPLACEMENT:" + engineDisplacement);
		System.out.println("MAX POWER          :" + maxPower);
		System.out.println("GEAR BOX           :" + gearBox);
		System.out.println("WHEELS TYPE        :" + wheelsType);
		System.out.println("FUEL TYPE          :" + fuelType);
		System.out.println("FUEL TANK CAPACITY :" + fuelTankCapacity);
		System.out.println("AVERAGE            :" + average);
		System.out.println("VEHICLE COMPANY NAME:" + vehicleCompanyName);
		System.out.println("WARRANTY           :" + warranty);
		System.out.println("COMPANY NAME       :" + companyName);
		System.out.println("VEHICLE MODEL      :" + vehicleModel);
		System.out.println("VEHICLE INFO       :" + vehicleInfo);

	}
}




public class Vishal_229 
{
	public static void main(String[] args) 
	{
			boolean bmw = false; //boolean expression

		do     //do-while loop used
		    {
				Scanner sc = new Scanner(System.in); // scanner statement
				System.out.println("**********************************");
				System.out.println("   !!!!......WELCOME......!!!!  ");
				System.out.println("**********************************");
				System.out.println("Enter which_type_of_wheeler_you_want_to_used");
				System.out.println("1. Two whee1er");
				System.out.println("2. Three wheeler");
				System.out.println("3. Four wheeler");
				System.out.println("4. Six wheeler");
			
					try    //with the help of try-catch exception
					{
							int aaa = sc.nextInt();
								switch (aaa) 
									         {
									         	case 1:
									         			System.out.println("YOU SELECTING 2 WHEELER");
									         			System.out.println("==========================");
									         			System.out.println("Enter_which_type_fuel_varient_you_buy");
									         			System.out.println("1. Petrol");
									         			System.out.println("2. Electric vehicle");
									         			int bbb = sc.nextInt();
									         			switch (bbb) 
									         						{
									         							case 1:
									         									System.out.println("YOU SELECTING THE PETROL VARIENT");
									         									System.out.println("==================================");
									         									System.out.println("Enter-which-company-of-two-wheeler-you-buy");
									         									System.out.println("1. Honda");
									         									System.out.println("2. Bajaj");
									         									int ccc = sc.nextInt();
									         									switch (ccc) 
									         												{
									         													case 1:
									         															System.out.println("YOU SELECTING HONDA COMPANY");
									         															System.out.println("==================================");
									         															System.out.println("Enter-which-model-you-want to-choose");
									         															System.out.println("1. Honda CB Shine 125");
									         															System.out.println("2. Honda Unicorn ");
									         															int ddd = sc.nextInt();
									         															switch (ddd) 
									         																		{
									         																			case 1:
									         																					System.out.println(" --<<-----Congratualtion----->>--");
									         																					System.out.println("YOU SELECTED HONDA CB SHINE 125 ");
									         																					System.out.println("=================================");
									         																					vehicle V1 = new vehicleModel("Honda Shine", "Honda Shine", "Pearl Siren Blue","Athletic Blue Metallic", "Imperial Red Metallic", "125 CC","0.74 PS @ 7500 rpm", "5 speed", "Alloy", "Petrol", "10.5 L", "60 kmpl","HONDA CB Shine 125 CC", "3", "HONDA", "2018 top model", "");
									         																					V1.details();
									         																					System.out.println("Please enter NumberPalte Number you want");
									         																					String z = sc.next();
									         																					V1.setnumberPlate(z);
									         																					System.out.println(V1.getNumberplate());
									         																					System.out.println("==================================");
									         																					System.out.println("END");
									         																					break;
									         																			case 2:
									         																					System.out.println(" --<<-----Congratualtion----->>--");
									         																					System.out.println("YOU SELECTED HONDA UNICORN");
									         																					System.out.println("=================================");
									         																					vehicle v2 = new vehicleModel("Honda Unicorn", "102000", "Pearl Igenous Black","Mat Axis Gray Metallic", "Imperial Red Metallic", "162.7 CC","12.91 PS @ 7500 rpm", "5 speed", "Alloy", "Petrol", "13 L", "60 kmpl","Honda Unicorn", "6", "HONDA", "2019 top model", "");
									         																					v2.details();
									         																					System.out.println("Please enter NumberPalte Number you want");
									         																					String y = sc.next();
									         																					v2.setnumberPlate(y);
									         																					System.out.println(v2.getNumberplate());
									         																					System.out.println("==================================");
									         																					System.out.println("END");
									         																					break;

									         																			default:
									         																					System.out.println("Please enter valid input");
									         																					break;
									         																		}
									         															break;
									         													case 2:
									         															System.out.println("YOU SELECTING BAJAJ COMPANY");
									         															System.out.println("==================================");
									         															System.out.println("Enter-which-model-you-want to-choose");
									         															System.out.println("1. Pulser 220");
									         															System.out.println("2. Discover 125");
									         															int nnn = sc.nextInt();
									         															switch (nnn) 
									         																		{
									         																			case 1:
									         																					System.out.println(" --<<-----Congratualtion----->>--");
									         																					System.out.println("YOU SELECTED PULSER 220");
									         																					System.out.println("==================================");
									         																					vehicle v1 = new vehicleModel("Bajaj Pulsor 220", "123999-128999", "Volcanic Red","Pearl White", "Sparkle Black", "220.0 CC", "14 PS @ 8500 rpm", "5 speed","Alloy", "Petrol", "15 L", " 40 kmpl", " BAJAJ PULSOR 220", "5", "BAJAJ","2020 top model", "");
									         																					v1.details();
									         																					System.out.println("Please enter NumberPalte Number you want");
									         																					String y = sc.next();
									         																					v1.setnumberPlate(y);
									         																					System.out.println(v1.getNumberplate());
									         																					System.out.println("==================================");
									         																					System.out.println("END");
									         																					break;
									         																			case 2:
									         																					System.out.println(" --<<-----Congratualtion----->>--");
									         																					System.out.println("YOU SELECTED DISCOVER 125");
									         																					System.out.println("==================================");
									         																					vehicle v2 = new vehicleModel("Bajaj Discover 125", "51678-62456", "Black  with grey","Black", "Black with red", "124.5 CC", "11 PS @ 7500 rpm", "5 speed", "Alloy","Petrol", "8 L", " 82.4 kmpl", "BAJAJ DISCOVER 125", "5", "BAJAJ","2015 top model", "");
									         																					v2.details();
									         																					System.out.println("Please enter NumberPalte Number you want");
									         																					String z = sc.next();
									         																					v2.setnumberPlate(z);
									         																					System.out.println(v2.getNumberplate());
									         																					System.out.println("==================================");
									         																					System.out.println("END");
									         																					break;

									         																			default:
									         																					System.out.println("Please Enter valid input");
									         																					break;
									         																		}
									         															break;
									         													default:
									         															System.out.println("please Enter valid input");
									         															break;
									         												}
									         									break;
									         							case 2:
									         									System.out.println("YOU SELECTING THE ELECTRIC VARIENT");
									         									System.out.println("==================================");
									         									System.out.println("Enter-which-company-of-two-wheeler-you-buy");
									         									System.out.println("1. Okinawa");
									         									System.out.println("2. OLA");
									         									int eee = sc.nextInt();
									         									switch (eee) 
									         												{
									         													case 1:
									         															System.out.println("YOU SELECTING THE OKINAWANA COMPANY");
									         															System.out.println("===================================");
									         															System.out.println("Enter-company-model");
									         															System.out.println("1. Okhi90");
									         															System.out.println("2. Okinawa Dual");
									         															int fff = sc.nextInt();
									         															switch (fff) 
									         																		{

									         																		case 1:
									         																				System.out.println(" --<<-----Congratualtion----->>--");
									         																				System.out.println("YOU SELECTED Okhi90");
									         																				System.out.println("============================");
									         																				vehicle v1 = new vehicleModel("Okhi90", "121999", "Mat Axis Gray Metallic", "Pearl White", "Volcanic Red", "", "399kW", "Automatic", "Aluminium Alloy", "Electric", "4.5 Kwh", "185 kmpc", "Okhi90", "5","Okinawa", "2021 Top Model", "");
									         																				v1.details();
									         																				System.out.println("Please enter NumberPalte Number you want");
									         																				String y = sc.next();
									         																				v1.setnumberPlate(y);
									         																				System.out.println(v1.getNumberplate());
									         																				System.out.println("============================");
									         																				System.out.println("END");
									         																				break;
									         																		case 2:
									         																				System.out.println(" --<<-----Congratualtion----->>--");
									         																				System.out.println("YOU SELECTED Okinawa Dual");
									         																				System.out.println("============================");
									         																				vehicle v2 = new vehicleModel("Okinawa Dual", "61999-82995", "Mileanial Pink", "Coral Clam", "Matt Black", "", "250 kW", "Automatic", "Aluminium Alloy", "Electric", "2.99 Kwh", "60 kmpc", "Okinawa Dual", "5","Okinawa", "2022 Top Model", "");
									         																				v2.details();
									         																				System.out.println("Please enter NumberPalte Number you want");
									         																				String z = sc.next();
									         																				v2.setnumberPlate(z);
									         																				System.out.println(v2.getNumberplate());
										         																			System.out.println("============================");
										         																			System.out.println("END");
										         																			break;

									         																		default:
									         																				System.out.println("please enter the valid input");
									         																				break;
									         																		}
									         																			break;
									         													case 2:
									         															System.out.println("YOU SELECTING THE OLA COMPANY");
									         															System.out.println("===================================");
									         															System.out.println("Enter-company-model");
									         															System.out.println("1. OLA S1 Pro");
									         															System.out.println("2. OLA S1");
									         															int ggg = sc.nextInt();
									         															switch (ggg) 
									         																		{
									         																			case 1:
									         																					System.out.println(" --<<-----Congratualtion----->>--");
									         																					System.out.println("YOU SELECCTED OLA S1 PRO");
									         																					System.out.println("==========++++++++========");
									         																					vehicle v1 = new vehicleModel("OLA S1 PRO", "98999", "Sparkle Black", "Pearl White", "Volcanic Red", "", "9.2 kW", "Automatic", "Aluminium Alloy", "Electric", "4.2 Kwh", "122 kmpc", "OLA S1 PRO", "5","OLA", "2022 Top Model", "");
									         																					v1.details();
									         																					System.out.println("Please enter NumberPalte Number you want");
									         																					String y = sc.next();
									         																					v1.setnumberPlate(y);
									         																					System.out.println(v1.getNumberplate());
									         																					System.out.println("============================");
									         																					System.out.println("END");
									         																					break;
									         																			case 2:
									         																				System.out.println(" --<<-----Congratualtion----->>--");
									         																				System.out.println("YOU SELECTED OLA S11"
									         																						+ "");
									         																				System.out.println("==========================");
									         																				vehicle v2 = new vehicleModel("OLA S1", "85099-120999", "Matt Black", "Coral Clam", "Mileanial Pink", "", "8.5kW", "Automatic", "Aluminium Alloy", "Electric", "3.97 Kwh", "181 kmpc", "OLA S1", "5","OLA", "2021 Top Model", "");
									         																				v2.details();
									         																				System.out.println("Please enter NumberPalte Number you want");
									         																				String z = sc.next();
									         																				v2.setnumberPlate(z);
									         																				System.out.println(v2.getNumberplate());
									         																				System.out.println("============================");
									         																				System.out.println("END");
									         																				break;

									         																			default:
									         																					System.out.println("please select the valid input");
									         																					break;
									         																		}
									         															break;

									         													default:
									         															System.out.println("please enter valid input");
									         															break;
									         												}
									         									break;

									         							default:
									         									System.out.println("please enter valid input");
									         									break;
									         						}
									         			break; 

									         	case 2:
									         			System.out.println("YOU SELECTING 3 WHEELER");
									         			System.out.println("==========================");
									         			System.out.println("Enter_which_type_fuel_varient_you_buy");
									         			System.out.println("1. Auto");
									         			int HHH = sc.nextInt();
									         			switch (HHH) 
									         						{
									         							case 1:
									         									System.out.println(" --<<-----Congratualtion----->>--");
									         									System.out.println("YOU SELECTED AUTO");
									         									System.out.println("============================");
									         									vehicle v2 = new threeWheeler("Bajaj Auto", "235999", "Eco Gree", "Black Yellow","Golden Yellow", "198.88 CC", "17 PS @3500 rpm", "4 speed", "Alloy", "Petrol", "8 L"," 34 kmpl", "BAJAJ AUTO", "4", "BAJAJ", "2018 top model", "");
									         									v2.details();
									         									System.out.println("Please enter NumberPalte Number you want");
									         									String y = sc.next();
									         									v2.setnumberPlate(y);
									         									System.out.println(v2.getNumberplate());
									         									System.out.println("=======================================");
									         									System.out.println("END");
									         									break;

									         							default:
									         									System.out.println("please enter the valid input");
									         									break;
									         						}
									         			break;

				case 3:
						System.out.println("YOU SELECTING 4 WHEELER");
						System.out.println("==========================");
						System.out.println("Enter_which_type_fuel_varient_you_buy");
						System.out.println("1. Petrol Varient");
						System.out.println("2. Diseal Varient");
						System.out.println("3. Electric Varient");
						System.out.println("4. CNG Varient");
						int kkk = sc.nextInt();					
						switch (kkk) 
									{
										case 1:
												System.out.println("YOU SELECTING THE PETROL VARIENT");
												System.out.println("=======================================");
												System.out.println("Enter which companies car you want");
												System.out.println("1. Honda ");
												System.out.println("2. Toyata");
												int lll = sc.nextInt();
												switch (lll) 
															{
																case 1:
																		System.out.println("YOU SELECTING HONDA");
																		System.out.println("=======================================");
																		System.out.println("Enter which car you want to buy ");
																		System.out.println("1. Honda City ZX ");
																		System.out.println("2. Honda Jazz");
																		int abc = sc.nextInt();
																		switch (abc) 
																					{
																						case 1:
																								System.out.println(" --<<-----Congratualtion----->>--");
																								System.out.println("You Selected HONDA CITY ZX");
																								System.out.println("=======================================");
																								vehicle v2 = new vehicleINFO("Honda City ZX","1139999","Golden Brown Metallic","Lunar Silver Metallic","Radiant Red Metallic","Honda","6  Speed  / Manual Transmission","Petrol","18-27 kmpl","40 L","2022 Top Model","4 cylinder engine","145-200 Nm","119 BHP @ 6600 rpm","16x6 inches","5  Passengers","Non- ABS","No","3");
																								v2.details();
																								System.out.println("Please enter NumberPalte Number you want");
																								String y = sc.next();
																								v2.setnumberPlate(y);
																								System.out.println(v2.getNumberplate());
																								System.out.println("=======================================");
																								System.out.println("END");
																								break;
																						case 2:
																								System.out.println(" --<<-----Congratualtion----->>--");
																								System.out.println("You Selected HONDA JAZZ");
																								System.out.println("=======================================");
																								vehicle v1 = new vehicleINFO("Honda Jazz","1018999","Radiant red metallic","Lunar Silver Metallic","Platinum white Metallic","Honda","6  Speed  / Manual Transmission","Petrol","17 kmpl","40 L","2019  top model","4 cylinder engine","110 Nm","98 BHP @3600 rpm","15x5.5 inches","5  Passengers","Non- ABS","No","3");
																								v1.details();
																								System.out.println("Please enter NumberPalte Number you want");
																								String w = sc.next();
																								v1.setnumberPlate(w);
																								System.out.println(v1.getNumberplate());
																								System.out.println("=======================================");
																								System.out.println("END");
																								break;

																						default:
																								System.out.println("Please enter valid input");
																								break;
																					}
																		break;
																case 2:
																		System.out.println("YOU SELECTING  TOYATA");
																		System.out.println("=======================================");
																		System.out.println("Enter which car you want to buy ");
																		System.out.println("1. TOYATA FORTUNER");
																		System.out.println("2. TOYATA INNOVA");
																		int QWE = sc.nextInt();
																		switch (QWE)
																					{
																						case 1:
																								System.out.println(" --<<-----Congratualtion----->>--");
																								System.out.println("You selecting TOYATA FORTURNER");
																								System.out.println("=======================================");
																								vehicle v1 = new vehicleINFO("Toyata Fortuner","3312345","Phantom Brown","Super White","Attitude Black","Toyata","6  Speed  / Manual Transmission","Petrol","10 kmpl","80 L","2021 Top Model","4 cylinder engine","245-500 Nm","201.15 BHP @3000 rmp","18x8 inches","7 Passengers","ABS with EBS and Traction Control","YES","3");
																								v1.details();
																								System.out.println("Please enter NumberPalte Number you want");
																								String w = sc.next();
																								v1.setnumberPlate(w);
																								System.out.println(v1.getNumberplate());
																								System.out.println("=======================================");
																								System.out.println("END");							
																								break;
																						case 2:
																								System.out.println(" --<<-----Congratualtion----->>--");
																								System.out.println("You selecting TOYATA INNOVA");
																								System.out.println("=======================================");
																								vehicle v2 = new vehicleINFO("Toyata Innova","1786999","Sparking Black Crustal Shine","Garnet Red","White Pearl Crystal Shine","Toyata ","6  Speed  / Manual Transmission","Petrol","11- 16 kmpl","65 L","2017 Top Model","4 cylinder engine","245 - 360 Nm","148 BHP @ 1400 rpm","17x7 inches","7 Passengers","ABS with EBS and Traction Control","YES","3");
																								v2.details();
																								System.out.println("Please enter NumberPalte Number you want");
																								String e = sc.next();
																								v2.setnumberPlate(e);
																								System.out.println(v2.getNumberplate());
																								System.out.println("=======================================");
																								System.out.println("END");
																								break;

																						default: 
																								System.out.println("Please enter valid input");
																								break;
																					}
							
							
							
																		break;

																default:
																		System.out.println("Please select valid input");
																		break;
															}
												break;
										case 2:
												System.out.println("YOU SELECTING THE DISEAL VARIENT");
												System.out.println("=======================================");
												System.out.println("Enter which companies car you want");
												System.out.println("1. ford ");
												System.out.println("2. Toyata");
												int mmm = sc.nextInt();
												switch (mmm) 
												{
												case 1:
														System.out.println("YOU SELECTED ford");
														System.out.println("=======================================");
														System.out.println("Enter which car you want to buy ");
														System.out.println("1. Ford Endavour ");
														int y = sc.nextInt();
														switch (y) 
																	{
																		case 1:
																			System.out.println(" --<<-----Congratualtion----->>--");
																			System.out.println("YOU SELECTED FORD ENDAVOUR");
																			System.out.println("=======================================");
																			vehicle v1 = new vehicleINFO("Ford  Endavour","4148987","Daimond White","Absolute Black","Diffused Silver","Ford","6  Speed  / Manual Transmission","Diseal","13 kmpl","80 L","2022 Top Model","4 cylinder engine","470 Nm","197 BHP @ 3000 rpm","18x8 inches","7 Passengers","ABS with EBS and Traction Control","YES","3");
																			v1.details();
																			System.out.println("Please enter NumberPalte Number you want");
																			String w = sc.next();
																			v1.setnumberPlate(w);
																			System.out.println(v1.getNumberplate());
																			System.out.println("=======================================");
																			System.out.println("END");
																			break;

																		default:
																				System.out.println("please enter valid input");
																				break;
																	}
							
							
						
														break;
													case 2:
															System.out.println("YOU SELECTing Toyata");
															System.out.println("=======================================");
															System.out.println("Enter which car you want to buy ");
															System.out.println("1. Toyata Innova");
															System.out.println("2. Toyata Fortuner");
															int zxc = sc.nextInt();
															switch (zxc) 
																		{
																			case 1:
																					System.out.println(" --<<-----Congratualtion----->>--");
																					System.out.println("You selected Toyata innova");
																					System.out.println("=======================================");
																					vehicle v1 = new vehicleINFO("Toyata Innova","1986999","Sparking Black Crustal Shine","Garnet Red","White Pearl Crystal Shine","Toyata ","6  Speed  / Manual Transmission","Diseal","11- 16 kmpl","65 L","2017 Top Model","4 cylinder engine","245 - 360 Nm","148 BHP @ 1400 rpm","17x7 inches","7 Passengers","ABS with EBS and Traction Control","YES","3");
																					v1.details();
																					System.out.println("Please enter NumberPalte Number you want");
																					String w = sc.next();
																					v1.setnumberPlate(w);
																					System.out.println(v1.getNumberplate());
																					System.out.println("=======================================");
																					System.out.println("END");
																					break;
																			case 2:
																				System.out.println(" --<<-----Congratualtion----->>--");
																				System.out.println("You selected Toyata fortuner");
																				System.out.println("=======================================");
																				vehicle v2 = new vehicleINFO("Toyata Fortuner","3312345","Phantom Brown","Super White","Attitude Black","Toyata","6  Speed  / Manual Transmission","Diseal","10 kmpl","80 L","2021 Top Model","4 cylinder engine","245-500 Nm","201.15 BHP @3000 rmp","18x8 inches","7 Passengers","ABS with EBS and Traction Control","YES","3");
																				v2.details();
																				System.out.println("Please enter NumberPalte Number you want");
																				String e = sc.next();
																				v2.setnumberPlate(e);
																				System.out.println(v2.getNumberplate());
																				System.out.println("=======================================");
																				System.out.println("END");
																				break;
																			default:
																					System.out.println("please enter valid input");
																					break;
																		}
							
							
															break;
													default:
															System.out.println("Please enter the valid input");
															break;
												}
											break;
													case 3:
															System.out.println("YOU SELECTING THE ELECTRIC VARIENT");
															System.out.println("=======================================");
															System.out.println("Enter which companies car you want");
															System.out.println("1. Tesla");
															System.out.println("2. MG Hector");
															int ooo = sc.nextInt();
															switch (ooo) 
																		{
																			case 1:
																					System.out.println("YOU SELECTEDing TESLA");
																					System.out.println("=======================================");
																					System.out.println("please which model you want to buy?");
																					System.out.println("1. Tesla Model S");							
																					int ewq = sc.nextInt();
																					switch (ewq) 
																								{
																									case 1:
																											System.out.println(" --<<-----Congratualtion----->>--");
																											System.out.println("YOU SELECTED TESLA MODEL S");
																											System.out.println("=======================================");
																											vehicle v1 = new vehicleINFO("Tesla Model S","7099999","Lunar Silver Metallic","Attitude Black","Garnet Red","Tesla","Automation Transmission","Electric","647 kmpc","100 kWh (Lithium-ion-battery)","2022 Top Model","","329 Nm","259 HP","16x6 inches","5 Passenger","ABS with EBS and Traction Control","YES","5");
																											v1.details();
																											System.out.println("Please enter NumberPalte Number you want");
																											String w = sc.next();
																											v1.setnumberPlate(w);
																											System.out.println(v1.getNumberplate());
																											System.out.println("=======================================");
																											System.out.println("END");								
																											break;

																									default:
																											System.out.println("please select enter valid input");
																											break;
																								}
																					break;
																			case 2:
																					System.out.println("YOU SELECTEDing MG HECTOR");
																					System.out.println("=======================================");
																					System.out.println("please which model you want to buy?");
																					System.out.println("1. MG ZS EV");
																					int dsa = sc.nextInt();
																					switch (dsa) 
																								{
																									case 1:
																											System.out.println(" --<<-----Congratualtion----->>--");
																											System.out.println("YOU SELECTING  MG ZS EV");
																											System.out.println("=======================================");
																											vehicle v1 = new vehicleINFO("MG ZS EV","6899999","Radiant Red Metallic","Superior White","Sparking Black Crustal Shine","MG Hector","Automation Transmission","Electric","513 kmpc","50.4 kWh (Lithium-ion-battery)","2022 Top Model","","257 Nm","154 HP","15x5.6 inches","5 Passenger","ABS with EBS and Traction Control","YES","5");
																											v1.details();
																											System.out.println("Please enter NumberPalte Number you want");
																											String w = sc.next();
																											v1.setnumberPlate(w);
																											System.out.println(v1.getNumberplate());
																											System.out.println("=======================================");
																											System.out.println("END");
																											break;

																									default:
																											System.out.println("please enter valid input");
																											break;
																								}
							
																					break;

																			default:
																					System.out.println("Please enter valid input");
																					break;
																	}
															break;
													case 4 :
														System.out.println("YOu selecting CNG varient");
														System.out.println("=======================================");
														System.out.println("Enter which company you want to buy");
														System.out.println("1. Maruti Suzuki");
														int ert = sc.nextInt();
														switch (ert) 
														 			{
														 				case 1:
														 						System.out.println("you selecting Maruti suzuki");
														 						System.out.println("=======================================");
														 						System.out.println("Enter which model you want");
															 					System.out.println("1. Maruti Suzuki Wagon R");
															 					System.out.println("2. Maruti Suzuki Ertiga");			
															 					int rty = sc.nextInt();
															 					switch (rty) 
															 								{
															 									case 1:
															 											System.out.println(" --<<-----Congratualtion----->>--");
															 											System.out.println("You selected Maruti Suzuki Wagon R");
															 											System.out.println("=======================================");
															 											vehicle v1 = new vehicleINFO("Wagon R","599999","Solid White","Poolside Blue","Magma Grey","Maruti Suzuki","5 Speed / Manual Transmission","CNG","20 kmpkg","35 L","2020 Top Model","4 cylinder engine","113 Nm","88.50 BHP @ 6000 rpm","13X4.9 inches","5 Passenger","Non-ABS","NO","3");
															 											v1.details();
															 											System.out.println("Please enter NumberPalte Number you want");
															 											String w = sc.nextLine();
															 											v1.setnumberPlate(w);
															 											System.out.println(v1.getNumberplate());
															 											System.out.println("=======================================");
															 											System.out.println("END");
															 											break;
															 									case 2:
															 											System.out.println(" --<<-----Congratualtion----->>--");
															 											System.out.println("You selected Maruti Suzuki Ertiga");
															 											System.out.println("=======================================");
															 											vehicle v2 = new vehicleINFO("Ertiga","999999","Pearl Arctic White","Splendid Silver","Metallic Magma Grey","Maruti Suzuki","5 Speed / Manual Transmission","CNG","26 kmpkg","45-60 L","2019 Top Model","4 cylinder engine","121.5 Nm","101.65 BHP @4200 rpm","15x5.6 inches","7 Passenger","Non-ABS","NO","3");
															 											v2.details();
															 											System.out.println("Please enter NumberPalte Number you want");
															 											String r = sc.next();
															 											v2.setnumberPlate(r);
															 											System.out.println(v2.getNumberplate());
															 											System.out.println("=======================================");
															 											System.out.println("END");
															 											break;

															 									default:
															 											System.out.println("Please enter valid input");
															 											break;
															 								}
															 					break;

														 				default:
														 						System.out.println("please enter the valid input");
														 						break;
														 			}
														break;

													default:
															System.out.println("Please enter the valid input");
															break;
									}
						break;

				case 4:
						System.out.println("YOU SELECTING 6 WHEELER");
						System.out.println("==========================");
						System.out.println("Enter_which_type_fuel_varient_you_buy");
						System.out.println("1. Bus");
						int III = sc.nextInt();
						switch (III)
									{
										case 1:
											System.out.println("YOU SELECTED BUS");
											System.out.println("============================");
											vehicle v2 = new sixWheeler("Ashok Leyland Bus", "2799999-3380009", "Red", "Blue", "White","5660 CC", "700 PS @ 4000rpm", "6 speed", "Alloy", "Diseal", "185 L", "20.07 kmpl","Ashok Leyland Bus", "5", "Ashok Leyland", "2018 top model", ""); 
											v2.details();
											System.out.println("Please enter NumberPalte Number you want");
											String y = sc.next();
											v2.setnumberPlate(y);
											System.out.println(v2.getNumberplate());
											System.out.println("=======================================");
											System.out.println("END");
											break;

										default:
												System.out.println("please enter the valid input");
												break;
									}
							break;

					default:
							System.out.println("please enter the valid input");
							break;

									         }
												System.out.println("Do you want to progrma start from begin ?" + "\n" + "Press true for yes" + "\n" + "Press false for no");
												bmw = sc.nextBoolean();
							}//try block ending here 
					catch (InputMismatchException ie) //exception handling mechanisum.
					{
						System.out.println("Please enter correct value");
					}  //catch block ending here
					
		} while (bmw == true);  //if condition true loop start from begin
	}
}
