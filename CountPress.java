import java.util.*;

public class CountPress {
    private static int calculateMinBrushPresses(int[][] AllVertices, int brushSz) {
        // Find the bounding rectangle for the wall
        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
        
        for (int[] vertex : AllVertices) {
            minX = Math.min(minX, vertex[0]);
            maxX = Math.max(maxX, vertex[0]);
            minY = Math.min(minY, vertex[1]);
            maxY = Math.max(maxY, vertex[1]);
        }
        
        // Set to store all blocks inside the wall
        Set<String> coveredBlocks = new HashSet<>();
        
        // Collect all blocks inside the polygon
        for (int x = minX; x <= maxX; x++) {
            for (int y = minY; y <= maxY; y++) {
                if (isPointInsideWall(x, y, AllVertices)) {
                    coveredBlocks.add(x + "," + y);
                }
            }
        }
        
        // Track painted blocks
        Set<String> paintedBlocks = new HashSet<>();
        int pressCount = 0;
        
        // Continue until all blocks are painted
        while (!coveredBlocks.isEmpty()) {
            // Sort blocks to have deterministic and optimal placement
            List<String> remainingBlocks = new ArrayList<>(coveredBlocks);
            Collections.sort(remainingBlocks);
            
            // Find the first unpainted block
            String startBlock = null;
            for (String block : remainingBlocks) {
                if (!paintedBlocks.contains(block)) {
                    startBlock = block;
                    break;
                }
            }
            
            if (startBlock == null) break;
            
            // Parse coordinates
            String[] coords = startBlock.split(",");
            int startX = Integer.parseInt(coords[0]);
            int startY = Integer.parseInt(coords[1]);
            
            // Increment press count
            pressCount++;
            
            // Paint brush area
            for (int dx = 0; dx < brushSz; dx++) {
                for (int dy = 0; dy < brushSz; dy++) {
                    int newX = startX + dx;
                    int newY = startY + dy;
                    String newBlock = newX + "," + newY;
                    
                    // If block is inside wall, mark it as painted
                    if (isPointInsideWall(newX, newY, AllVertices)) {
                        paintedBlocks.add(newBlock);
                        coveredBlocks.remove(newBlock);
                    }
                }
            }
        }
        
        return pressCount;
    }
    
    // Ray casting algorithm to check if point is inside wall
    private static boolean isPointInsideWall(int x, int y, int[][] AllVertices) {
        boolean inside = false;
        int j = AllVertices.length - 1;
        
        for (int i = 0; i < AllVertices.length; j = i++) {
            if (((AllVertices[i][1] > y) != (AllVertices[j][1] > y)) &&
                (x < (AllVertices[j][0] - AllVertices[i][0]) * (y - AllVertices[i][1]) / 
                 (AllVertices[j][1] - AllVertices[i][1]) + AllVertices[i][0])) {
                inside = !inside;
            }
        }
        
        return inside;
    }
    
    // Main method to read input and calculate result
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
            
        int verticenum = scan.nextInt();
        
        int[][] AllVertices = new int[verticenum][2];
        for (int in = 0; in < verticenum; in++) {
            AllVertices[in][0] = scan.nextInt();
            AllVertices[in][1] = scan.nextInt();
        }

        int brushSz = scan.nextInt();
        
        int minBPress = calculateMinBrushPresses(AllVertices, brushSz);
        
        System.out.print(minBPress);
        
        scan.close();
    }
}