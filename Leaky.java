import java.util.Scanner;
public class Leaky{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int op_rate,i,n,bsize;
		int pkt[]=new int[20];
		System.out.println("Enter the bucket size:");
		bsize=sc.nextInt();
		System.out.println("Enter the output rate of the bucket:");
		op_rate=sc.nextInt();
		System.out.println("Enter number of Packets:");
		n=sc.nextInt();
		for(i=0;i<n;i++){
			System.out.println("Enter the size of"+(i+1)+"Packet\t");
			pkt[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			if(pkt[i]>bsize){
				System.out.println("Packet"+(i+1)+"size is"+pkt[i]+"exceeds bucket size,so discard");
				continue;
			}
			while(pkt[i]!=0){
				if(op_rate<pkt[i]){
					System.out.println(op_rate+"bytes of packet"+(i+1)+"Sent");
					pkt[i]-=op_rate;
				}
				else{
					System.out.println(pkt[i]+"bytes of Packet"+(i+1)+"Sent");
					pkt[i]=0;
				}
				}
				System.out.println("------Packet"+(i+1)+"Completely Sent--------");
			}
			}
		}
