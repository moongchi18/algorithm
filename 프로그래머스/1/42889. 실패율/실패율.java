import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] solution(int N, int[] stages) {
    	List<Stage> list = new ArrayList<>();
    	for (int i = 0; i < N + 1; i++) {
			list.add(new Stage(i + 1));
		}
    	for (int i = 0; i < stages.length; i++) {
			int blockedFloor = stages[i] - 1;
			list.get(blockedFloor).blockedPeopleCountPlus();
			for (int j = 0; j < blockedFloor; j++) {
				list.get(j).attemptedPeopleCountPlus();
			}
		}
    	
    	return list.stream()
    				.sorted(Comparator.comparing(Stage::getBlockedRatio).reversed())
//    						.thenComparing(Stage::getFloor))
    				.filter(s -> s.getFloor() <= N)
    				.peek(System.out::println)
    				.mapToInt(Stage::getFloor)
    				.toArray();
    }
    
    class Stage{
    	int floor;
    	int blockedPeopleCount;
    	int attemptPeopleCount;
    	
    	Stage(int floor){
    		this.floor = floor;
    		this.blockedPeopleCount = 0;
    		this.attemptPeopleCount = 0;
    	}
    	
    	public int getFloor() {
    		return this.floor;
    	}
    	public int getBlockedPeopleCount() {
    		return this.blockedPeopleCount;
    	}
    	public int getAttemptPeopleCount() {
    		return this.attemptPeopleCount;
    	}
    	public void blockedPeopleCountPlus() {
    		this.blockedPeopleCount++;
    	}
    	public void attemptedPeopleCountPlus() {
    		this.attemptPeopleCount++;
    	}
    	public double getBlockedRatio() {
    		if(blockedPeopleCount == 0) {
    			return 0;
    		}
    		return this.blockedPeopleCount / (double) this.attemptPeopleCount;
    	}
    	@Override
    	public String toString() {
    		return "floor : " + floor + ", blockedPeopleCount : " + blockedPeopleCount + ", attemptPeopleCount" + attemptPeopleCount;
    	}
    }
}