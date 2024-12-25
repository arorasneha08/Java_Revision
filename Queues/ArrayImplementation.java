public class ArrayImplementation {

    
class MyQueue {

    int front, rear;
	int arr[] = new int[100005];
	int size = 100005 ;
	int currSize ;

    MyQueue(){
		front=-1;
		rear=-1;
		currSize = 0 ; 
	}
	void push(int x){
	    if (currSize == size) {
            return; // Queue Overflow (though constraints may ensure it doesn't occur)
        }
	   if(currSize == 0){
	       front = 0 ;
	       rear= 0; 
	   }
	   else{
	       rear = (rear + 1) % size ; 
	   }
	   arr[rear] = x ;
	   currSize ++ ; 
	} 

	int pop(){
	    if(currSize == 0) return -1;
	    int elem = arr[front]; 
	    if(currSize == 1){
	        front = rear = -1; 
	    }
	    else{
	        front = (front + 1) % size ; 
	    }
	    currSize -- ;
	    return elem ; 
	}
}
}