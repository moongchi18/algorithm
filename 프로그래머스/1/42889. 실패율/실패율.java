import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] solution(int N, int[] stages) {
    	List<Stage> stageList = new ArrayList<>();
    	for (int i = 0; i < N + 1; i++) {
			stageList.add(createStageByFloor(i+1)); // index 0 -> stageFloor 1 
		}
    	for (int i = 0; i < stages.length; i++) {
			int index = stages[i] - 1; // stageFloor 1 -> index 0
			stageList.get(index).blockedPeopleCountPlus(); // 해당 스테이지에 막혀있는 플레이어 ++
			for (int j = 0; j < index; j++) {
				stageList.get(j).attemptedPeopleCountPlus(); // 해당 스테이지까지 스테이지 시도 플레이어 수++
			}
		}
    	
    	return stageList.stream()
    				.sorted(Comparator.comparing(Stage::getBlockedRatio).reversed()) 
    				// 스테이지에 막힌 플레이어 / 스테이지에 시도한 플레이어 수
    				.filter(s -> s.getFloor() <= N) // N 층을 클리어하여 N+1 층에 있는 경우 제외
    				.mapToInt(Stage::getFloor) // Stage -> 1 ~ N 
    				.toArray();
    }
    
    public Stage createStageByFloor(int floor) {
		return new Stage(floor);
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
    }
}