
import java.util.*;
import java.awt.Point; 

class rps{
	

public static int compare(char first, char second) 
{ 
	

	if (first == second) 
		return 0; 

	if (first == 'R')
	{ 
		if (second == 'S') 
			return 1; 
		else
			return -1; 
	} 
	if (first == 'P') 
	{ 
		if (second == 'R') 
			return 1; 
		else
			return -1; 
	} 
	if (first == 'S') 
	{ 
		if (second == 'P') 
			return 1; 
		else
			return -1; 
	} 
	
	return 0;
} 


public static Point countWins(int k, String a, 
									String b) 
{ 
	int n = a.length(); 
	int m = b.length(); 
	int i = 0, j = 0; 

	int moves = n * m; 
	Point wins = new Point (0, 0); 

	while (moves-- > 0)
	{ 
		int res = compare(a.charAt(i), 
						b.charAt(j)); 

 
		if (res == 1)
			wins = new Point(wins.x + 1,
							wins.y); 

 
		if (res == -1) 
			wins = new Point(wins.x, 
							wins.y + 1);
							
		i = (i + 1) % n; 
		j = (j + 1) % m; 
	} 

 
	int repeat = k / (n * m); 

	wins = new Point(wins.x * repeat,
					wins.y * repeat);
	

	int rem = k % (n * m);
	
	while (rem-- > 0) 
	{ 
		int res = compare(a.charAt(i), 
						b.charAt(j)); 
 
		if (res == 1) 
			wins = new Point(wins.x + 1, 
							wins.y); 

 
		if (res == -1) 
			wins = new Point(wins.x, 
							wins.y + 1); 
							
		i = (i + 1) % n; 
		j = (j + 1) % m; 
	} 
	return wins; 
} 


public static void main(String[] args)
{
	int k = 4; 
	String a = "SR", b = "R"; 
	Point wins = countWins(k, a, b); 

	System.out.println(wins.x + " " + wins.y);
}
}


