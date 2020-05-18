import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

//https://leetcode.com/problems/the-skyline-problem/
static class BuildingPoint implements Comparable<BuildingPoint>{
    int x;
    boolean isStart;
    int h;

    public int compareTo(BuildingPoint o){
        if(this.x!=o.x) return this.x-o.x;
        else {
            return (this.isStart?-this.h:this.h)-(o.isStart?-o.h:o.h);
        }
    }
}

class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> result =new ArrayList<>();
        int index=0;
        BuildingPoint[] points=new BuildingPoint[buildings.length*2];
        for(int building[] : buildings){
            points[index]=new BuildingPoint();
            points[index].x=building[0];
            points[index].isStart=true;
            points[index].h=building[2];

            points[index+1]=new BuildingPoint();
            points[index+1].x=building[1];
            points[index+1].isStart=false;
            points[index+1].h=building[2];
            index+=2;
        }

        Arrays.sort(points);
        TreeMap<Integer, Integer> treeMap=new TreeMap<>();
        treeMap.put(0, 1);
        int preMaxHigh=0;
        for(BuildingPoint point: points){
            if(point.isStart){
                treeMap.compute(point.h, (key, value)->{
                    if(value!=null) return value+1;
                    return 1;
                });
            }else{
                treeMap.compute(point.h, (key, value)->{
                    if(value ==1) return null;
                    return value-1;
                });
            }
            int currentMaxHeight=treeMap.lastKey();
            if(preMaxHigh!=currentMaxHeight){
                //result.add(new int[]{point.x, currentMaxHeight});
                
                ArrayList<Integer>node=new ArrayList<>();
                node.add(point.x); node.add(currentMaxHeight);
                result.add(node);               
                preMaxHigh = currentMaxHeight;
            }
        }

        return result;
    }
}