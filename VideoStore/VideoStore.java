package VideoStore;
import java.util.Scanner;
public class VideoStore extends Video {
	Video[] v=new Video[10];
	Scanner s =new Scanner(System.in);
	static int i=0;
	 public void addNewVideo(String title)  //when we are adding video
	 {	v[i]=new Video();
		 v[i].name=title;
		 v[i].flag=true;
		 v[i].rating=0;
		 i=i+1;
	 }
	 public void checked_Out(String title)   //to check video is perent to checkout or not
	 {int temp=0;
		 for(int j=0;j<i;j++)
		 {
			 if( v[j].name.equals(title))
			 {
				 if(v[j].flag)
				 {
					 System.out.println("video is present and dispatched :");
					 v[j].flag=v[j].beingCheckedout();
				 }
				 else
				 {
					 System.out.println("video is not present and can not be dispatched :");
				 }
				 temp=1;
			 }
		 }
		 if(temp==0)
		 {
			 System.out.println("no such video is available, THANK YOU ! ");
		 }
	 }
	 public void returned(String title,int rate) // to add video if returned by any user and add rating  
	 { int r=rate;
	   int temp=0;
		 for(int j=0;j<i;j++)
		 {
			 if( v[j].name.equals(title))
			 {
				 
			    v[j].flag=v[j].beingReturned();
			    System.out.println(v[j].beingReturned());
			    v[j].rating=v[j].rating(r);
			 }
		 }
		 if(temp==0)
		 {
			 System.out.println("no such video is available, THANK YOU ! ");
		 }
	 }
public void prinall ()
{
	for(int k=0;k<i;k++)
	{
		System.out.println(v[k].name);
	}
	}
	public static void main(String args[])
	{ int option;
		VideoStore vs = new VideoStore();
		Scanner s =new Scanner(System.in);
	
	
	while(true) {
		System.out.println("Enter \n 1 if add new video. \n 2 if return. \n 3 if checking out\n 4 to print all ");
		option=s.nextInt();
	switch(option)
	{
		case 2 :
			System.out.println("Enter title and rating ");
			String title1 = s.next();
			int rate=s.nextInt();
			vs.returned(title1,rate);
			break;
		case 3 :
			System.out.println("Enter title and rating ");
			String title2 = s.next();
			vs.checked_Out(title2);
			
			break;
		case 1 :
			System.out.println("Enter name of video : ");
			String title=s.next();	
			vs.addNewVideo(title);
			break;
		case 4 :
			
			vs.prinall();
			break;
		default:
			System.out.println(" Wrong Input !-)");
	}
	}}
	
}