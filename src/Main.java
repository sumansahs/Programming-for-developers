//
//public class ques7.Main {
//
//    int[][] serviceCenters;
//    int capacity;
//    int distanceTravelled;
//    int serviceDistance;
//    int serviceCapacity;
//    int newServiceDistance;
//    int prevDistance;
//    int nextServiceDistance;
//
//    ques7.Main(int[][] serviceCenters){
//        this.serviceCenters=serviceCenters;
//        this.capacity=10;
//        this.distanceTravelled=0;
//
//        for(int i=0;i<= serviceCenters.length;i++){
//            for(int j=1;j>=0;j--){
//                if(j==1){
//
//                    serviceCapacity=serviceCenters[i][j];
//                    System.out.println("service capacity is"+serviceCapacity);
//
//                }else {
//                    serviceDistance=serviceCenters[i][j];
//                    if(i==0){
//                        prevDistance=0;
//                        System.out.println("previous distance is"+prevDistance);
//                    }else{
//                        prevDistance=serviceCenters[i-1][j];
//                        System.out.println("previous distance is"+prevDistance);
//                    }
//                    System.out.println("service distance is"+serviceDistance);
//                    newServiceDistance=serviceDistance-prevDistance;
//                    System.out.println("new servicw distance is"+newServiceDistance);
//                    if(capacity>=newServiceDistance){
//                        distanceTravelled=serviceDistance;
//                        capacity-=newServiceDistance;
//                        System.out.println("capacity remaining is "+capacity);
//                        System.out.println("distance travelled is"+distanceTravelled);
//                        if(i<3){
//                            nextServiceDistance=serviceCenters[i+1][j]-serviceCenters[i][j];
//                            System.out.println("value of i is ---------"+i);
//                            System.out.println("-----------i am at next service distance  "+nextServiceDistance);
//                        }
//
//
//                        if(capacity<nextServiceDistance){
//                            System.out.println("stoppppppppp-------");
//                            capacity+=recharge(serviceCapacity);
//                            System.out.println("recharged at"+serviceDistance);
//                            System.out.println("capacity after recharge"+capacity);
//                        }
//
//                    }
////                    else{
////                        capacity=recharge(serviceCapacity);
////                        System.out.println("recharged at"+serviceDistance);
////                    }
//                }
//            }
//        }
//
//        for(int i=0; i< serviceCenters.length;i++){
//
//        }
//    }
//    int recharge(int serviceCentercharge){
//        this.capacity=capacity+serviceCentercharge;
//        return capacity;
//    }
//
//    public static void main(String[] args) {
//        int[][] arr={{10,60},{20,30},{30,30},{60,40}};
//        new ques7.Main(arr);
//    }
//}