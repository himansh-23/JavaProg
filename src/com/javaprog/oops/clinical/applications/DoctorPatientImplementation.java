package com.javaprog.oops.clinical.applications;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.javaprog.Utilities.Utility;
import com.javaprog.oops.clinical.models.Appointment;
import com.javaprog.oops.clinical.models.Doctor;
import com.javaprog.oops.clinical.models.Patients;

public class DoctorPatientImplementation implements DocotorPatientEntries
{
	static ObjectMapper mapper=new ObjectMapper(); 
	List<Patients> personlist=new ArrayList<>();
	List<Doctor> doctorlist=new ArrayList<>();
	List<Appointment> appointmentlist=new ArrayList<>();
	{
		try {
			personlist=mapper.readValue(new File("/home/administrator/Desktop/Clinical/Patients.json"), new TypeReference<List<Patients>>() {});
			doctorlist=mapper.readValue(new File("/home/administrator/Desktop/Clinical/Doctors.json"), new TypeReference<List<Doctor>>() {});
			appointmentlist=mapper.readValue(new File("/home/administrator/Desktop/Clinical/Appointment.json"), new TypeReference<List<Appointment>>() {});
	
		}
		catch(Exception e)
		{
	
		}
	}
	
	int id;
	String name;
	String availability;
	String specialization;
	String phone;
	int age;
	boolean saveflag=false;
	boolean changeflag=false;
	Utility input=new Utility();
	public DoctorPatientImplementation()
	{
		
	}
	
	public void operation()
	{
		int Answer=0;
		do {
			System.out.println("1. Add Doctor");	
			System.out.println("2. Edit Doctor");
			System.out.println("3. Delete Doctor");
			System.out.println("4. Add Patients");
			System.out.println("5. Edit Patients");
			System.out.println("6. Delete Patients");
			System.out.println("7. Save Changes");
			System.out.println("8. Fix Appointment ");
			System.out.println("9. Exit");
			Answer=input.getInt();
			switch(Answer)
			{
			case 1:
				addDoctor();
				break;
			case 2:
				editDoctor();
				break;
			case 3:
				deleteDoctor();
				break;
			case 4:
				addPatient();
				break;
			case 5:
				editPatient();
				break;
			case 6:
				deletePatient();
				break;
			case 7:
				save();
				break;
			case 8:
				fixAppointment();
				break;
			case 9:
				if(saveflag==false && changeflag==true)
				{
					System.out.println("Do You Want To save Changes\n 1.yes \n2. no");
					int Answer2=input.getInt();
					if(Answer2==1)
					{
						save();
					}
				}
				break;
			default:
				System.out.println("Invalid Option");
			}
			
		}while(Answer!=9);
		
	}
	
	public void addDoctor()
	{
		saveflag=false;
		changeflag=true;
		System.out.println("Enter Name");
		name=input.getString();
		System.out.println("Enter Specalization");
		specialization=input.getString();
		System.out.println("Enter Availability");
		availability=input.getString();
		id=0;
		if(doctorlist.size()>=1)
		{
			for(int i=0;i<doctorlist.size();i++)
			{
				if(id<doctorlist.get(i).getId())
				{
					id=doctorlist.get(i).getId();
				}
			}
		}
		doctorlist.add(new Doctor(id+1,name,availability,specialization));
	}
	
	public void editDoctor()
	{
		changeflag=true;
		saveflag=false;
		System.out.println("Enter Doctor Name");
		name=input.getString();
		int i=0;
		for(i=0;i<doctorlist.size();i++)
		{
			if(doctorlist.get(i).getName().equals(name))
			{
			break;
			}
		}
		
		if(i<doctorlist.size())
		{
			System.out.println("What You Want To Update");
			Doctor d=doctorlist.remove(i);
			int Answer2=0;
			do {
				System.out.println("1. Name");
				System.out.println("2. Specialization");
				System.out.println("3. Availability");
				System.out.println("4. Exit");
				Answer2=input.getInt();
				switch(Answer2)
				{
				case 1:
					System.out.println("Enter New Name");
					name=input.getString();
					d.setName(name);
					break;
				case 2:
					System.out.println("Enter New Specialization");
					specialization=input.getString();
					d.setSpecialization(specialization);
					break;
				case 3:
					System.out.println("Enter New Availability");
					availability=input.getString();
					d.setAvailability(availability);
					break;
				case 4:
					doctorlist.add(d);
					System.out.println("Exiting");
					break;
				default:
				System.out.println("Invalid Output");
				}
			}while(Answer2!=4);
		}
		else
		{
			System.out.println("Doctor Not Found");
		}
	}
	
	public void deleteDoctor()
	{
		changeflag=true;
		saveflag=false;
		System.out.println("Enter Doctor id");
		id=input.getInt();
		int i=0;
		for(i=0;i<doctorlist.size();i++)
		{
			if(doctorlist.get(i).getId()==id)
			{
				doctorlist.remove(i);
			}
		}
		if(i==doctorlist.size())
		{
			System.out.println("No Doctor Found With This Id");
		}
	}
	
	public void addPatient() 
	{
		changeflag=true;
		saveflag=false;
		System.out.println("Enter Patient Name");
		name=input.getString();
		System.out.println("Enter Patient Phone Number");
		phone=input.getString();
		System.out.println("Enter Patient Age");
		age=input.getInt();
		id=1;
		if(personlist.size()>=1)
		{
			id=personlist.get(personlist.size()-1).getId();
			personlist.add(new Patients(id+1,name,phone,age));
		}
	}
	
	public void editPatient()
	{
		changeflag=true;
		saveflag=false;
		System.out.println("Enter id Of Patients");
		id=input.getInt();
		int i=0;
		for(i=0;i<personlist.size();i++)
		{
			if(personlist.get(i).getId()==id)
			{
			break;
			}
		}
		
		if(i<doctorlist.size())
		{
			System.out.println("What You Want To Update");
			Patients p=personlist.remove(i);;
			int Answer2=0;
			do {
				System.out.println("1. Name");
				System.out.println("2. Age");
				System.out.println("3. PhoneNumber");
				System.out.println("4. Exit");
				Answer2=input.getInt();
				switch(Answer2)
				{
				case 1:
					System.out.println("Enter New Name");
					name=input.getString();
					p.setName(name);
					
					break;
				case 2:
					System.out.println("Enter New Age");
					age=input.getInt();
					p.setAge(age);

					break;
				case 3:
					System.out.println("Enter New PhoneNumber");
					phone=input.getString();
					p.setPhone(phone);
					break;
				case 4:
					personlist.add(p);
					System.out.println("Exiting");
					break;
				default:
				System.out.println("Invalid Output");
				
				}
				}while(Answer2!=4);
		}
		
		else
		{
			System.out.println("No Patient Found With This Name");
		}
	}
	
	public void deletePatient()
	{
		changeflag=true;
		saveflag=false;
		System.out.println("Enter Patient id");
		id=input.getInt();
		int i=0;
		for(i=0;i<personlist.size();i++)
		{
			if(personlist.get(i).getId()==id)
			{
				personlist.remove(i);
			}
		}
		if(i==personlist.size())
		{
			System.out.println("No Patient Found With This Id");
		}
	}
	
	public void save()
	{
		try 
		{
			saveflag=true;
			changeflag=false;
			mapper.writeValue(new File("/home/administrator/Desktop/Clinical/Patients.json"), personlist);
			mapper.writeValue(new File("/home/administrator/Desktop/Clinical/Appointment.json"),appointmentlist);
			mapper.writeValue(new File("/home/administrator/Desktop/Clinical/Doctors.json"), doctorlist);
		}
		catch (IOException e) 
		{	
			e.printStackTrace();
		}
	}

	@Override
	public void fixAppointment() {
		saveflag=false;
		changeflag=true;
		// TODO Auto-generated method stub
		System.out.println("Enter DoctorName");
		String doctorName=input.getString();
		System.out.println("Enter DoctorId");
		int doctorId=input.getInt();
		System.out.println("Enter PatientName");
		String patientName=input.getString();
		System.out.println("Enter PatientId");
		int patientId=input.getInt();
		System.out.println("Enter Availibility");
		String date=input.getString();
		System.out.println("Enter Patient Phone Number");
		String patientphone=input.getString();
	//	doctorlist.stream().filter(i -> i.)
		appointmentlist.add(new Appointment(doctorName, doctorId, patientName, patientId, patientphone, date));
	}

}
