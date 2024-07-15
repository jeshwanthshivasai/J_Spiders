package Document;

import javax.management.loading.PrivateClassLoader;

public class Document_using_Constructor {
	private int file_id;
	private String file_name;
	private double file_size;
	private String file_type;
	
	public Document_using_Constructor(int file_id, String file_name, double file_size, String file_type) {
		this.file_id=file_id;
		this.file_name=file_name;
		this.file_size=file_size;
		this.file_type=file_type;
	}
	private void validateDocument() {
		validateFileID();
		validateFileName();
		validateFileSize();
		validateFileType();
	}
	private void validateFileID() 
	{
		if(file_id < 8) 
		{
			System.err.println("File ID must be 8 and above characters");
			return;
		}
	}
	private void validateFileName()
	{
		if(!file_name.matches("^(?=.*[a-z]) (?=.*(A-Z)) (?=.*\\d) (?=.*[!@#\\$%\\^&\\*]). + $")) 
		{
			System.err.println("File name must have at least 1 uppercase, 1 lowercase, 1 digit, and 1 special character");
			return;
		}
		if(!file_name.matches("^[A-Za-z] + _[A-Za-z] + $")) 
		{
			System.err.println("File name must have two words separated by an underscore and only contain alphabets");
			return;
		}
	}
	private void validateFileSize()
	{
		if(file_size < 5.3 || file_size > 85.6) 
		{
			System.err.println("File size must be between 5.3Mb and 85.6Mb");
			return;
		}
	}
	private void validateFileType()
	{
		if(!file_type.equals("PDF") && !file_type.equals("DOC") && !file_type.equals("PNG") && !file_type.equals("MP4")) 
		{
			System.err.println("File type must be one of the following: PDF, DOC, PNG, MP4");
			return;
		}
	}
	private double convertMbToKb() 
	{
		return file_size * 1024;
	}
	public void displayDocumentDetails()
	{
		System.out.println("Document Details: ");
		System.out.println("File ID: " + file_id);
		System.out.println("File Name: " + file_name);
		System.out.println("File Size: " + file_size);
		System.out.println("File Type: " + file_type);
		System.out.println("\n");
	}
}