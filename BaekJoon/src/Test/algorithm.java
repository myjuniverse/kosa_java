package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class algorithm {
	public static void main(String[] args) throws IOException {
		
//		# 큰순으로 출력하는 프로그램
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력할 숫자의 갯수를 입력하세요: ");
//		int num = sc.nextInt(); // 입력할 숫자의 갯수
//		
//        int[] arr = new int[num]; // 입력받은 값으로 배열 만들기
//        
//        System.out.print(num + "개의 숫자를 입력하세요: ");
//        for (int i = 0; i < arr.length; i++) {
//        	arr[i] = sc.nextInt();
//        }
//        
//        for (int i = 0; i < arr.length - 1; i++) { // i: 현재 비교 대상 위치
//        	for (int j = i + 1; j < arr.length; j++) { // j: i 이후 큰값 찾기
//                if (arr[i] < arr[j]) {  // 큰 값이 앞으로
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        
//        
//        for (int i = 0; i < arr.length; i++) {
//        	System.out.print(arr[i] + " ");
//        }
		
/* ---------------------------------------------------------------------------- */
//		# 상위 N명 점수 출력하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력할 숫자의 갯수를 입력하세요: ");
//		int m = sc.nextInt(); // 학생 수 m 입력
//		
//        int[] arr = new int[m]; // 입력받은 값으로 배열 만들기
//        
//        System.out.print(m + "개의 숫자를 입력하세요: ");
//        for (int i = 0; i < arr.length; i++) {
//        	arr[i] = sc.nextInt();
//        }
//        
//        System.out.print("출력할 상위 인원수를 입력하세요: ");
//        int n = sc.nextInt();
//        for (int i = 0; i < arr.length - 1; i++) {
//        	for(int j = i + 1; j < arr.length; j++) {
//        		if (arr[i] < arr[j]) {
//        			int temp = arr[i];
//        			arr[i] = arr[j];
//        			arr[j] = temp;
//        		}
//        	}
//        }
//  
//        for (int i = 0; i < n; i++) {
//        	System.out.print(arr[i] + " ");
//        }
/* ---------------------------------------------------------------------------- */
//		# baekjoon 10807
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		int v = sc.nextInt();
//
//		for (int i = 0; i < arr.length; i++) {
//			if (v == arr[i]) {
//				count++;
//			}
//		}
//		  System.out.println(count);
/* ---------------------------------------------------------------------------- */
//		# baekjoon 10871
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt(); // 수열의 개수
//		int x = sc.nextInt(); // 기준값
//		
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < x) {
//				System.out.print(arr[i] + " ");
//			}
//		}
/* ---------------------------------------------------------------------------- */
//		# baekjoon 10818
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		int max = arr[0];
//		int min = arr[0];
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//			if (arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		System.out.print(min + " " + max);		 
/* ---------------------------------------------------------------------------- */
//		# baekjoon 	10811
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt(); // 바구니 개수
//		int m = sc.nextInt(); // 뒤집기 횟수
//		int[] arr = new int[n];
//		
//		for (int k = 1; k < m; k++) {
//			int i = sc.nextInt();
//			int j = sc.nextInt();
//		}

/* ---------------------------------------------------------------------------- */
//		# baekjoon 	2562
//		Scanner sc = new Scanner(System.in);
//		
//		int arr[] = new int[9];
//		int max = arr[0]; // 최댓값을 담을 변수
//		int index = 0; // 최댓값의 위치를 담는 변수
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			if (arr[i] > max) {
//				max = arr[i];
//				index = i + 1;
//			}
//		}
//		System.out.println(max);
//		System.out.println(index);
/* ---------------------------------------------------------------------------- */
//		# baekjoon 1032
//		다시 해보기
//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//		String[] file = new String[n];
//
//		for (int i = 0; i < n; i++) {
//			file[i] = sc.next();
//		}
//
//		String str = "";
//
//		for (int i = 0; i < file[0].length(); i++) {
//			char ch = file[0].charAt(i);
//			for (int j = 1; j < n; j++) {
//				if (file[j].charAt(i) != ch) {
//					ch = '?';
//					break;
//				}
//			}
//			str += ch;
//		}
//		System.out.println(str);
/* ---------------------------------------------------------------------------- */
//		# baekjoon 1157
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//
//		int[] a = new int[26];
//		
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			
//			// 소문자면 대문자로 변경
//			if (ch >= 'a' && ch <= 'z') {
//				ch = (char) (ch - 32); // a - A = 32
//			}
//
//			a[ch - 'A']++; // 'A' 아스키코드 65 c-a=2 -> 2+1 abc
//		}
//
//		int max = 0;
//		char result = '?';
//
//		for (int i = 0; i < 26; i++) {
//			if (a[i] > max) {
//				max = a[i]; // 최댓값
//				result = (char) (i + 'A'); // (char)(2 + 65'A') = (char)(67) = 'C'
//			} else if (a[i] == max) {
//				result = '?'; // 동일
//			}
//		}
//
//		System.out.println(result);
/* ---------------------------------------------------------------------------- */
//		# baekjoon 11655
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			
//			if (ch >= 'A' && ch <= 'Z') { // 대문자 사이 일때
//			    if (ch <= 'M') ch += 13; // += 자동 형변환
//			    else ch -= 13;
//			} else if (ch >= 'a' && ch <= 'z') { // 소문자 사이 일때
//			    if (ch <= 'm') ch += 13;
//			    else ch -= 13;
//			}
//			System.out.print(ch);
//		}
/* ---------------------------------------------------------------------------- */
//		# baekjoon 2884
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int m = sc.nextInt();
//
//		if (m >= 45) {
//			m -= 45;
//		} else {
//			 m += 15;
//			if (h == 0) 
//				h = 23;
//			else h--;
//		}
//		
//		System.out.println(h + " " + m);
		
//		Scanner sc = new Scanner(System.in);
//        
//        int h = sc.nextInt();
//        int m = sc.nextInt();
//        
//        if(m < 45){
//            h --;
//            m = 60-(45-m);
//            
//            if(h < 0){
//                h = 23;
//            }
//            System.out.println(h+" "+m);
//        } else {
//            System.out.println(h+" "+(m-45));
//        }
		
/* ---------------------------------------------------------------------------- */
//		# baekjoon 2751
//		public static void main(String[] args) throws IOException {
//			// BufferedReader
//			// StringBuilder
//			// 출력할 때 System.out.println을 반복하지 않고
//			// 결과를 sb에 다 모은 뒤 한 번에 출력 
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			StringBuilder sb = new StringBuilder();
//			
//			// n개를 입력받는다
//			int n = Integer.parseInt(br.readLine()); // 입력된 한 줄을 "문자열"로 읽어옴
//			// readLine()은 항상 String으로 반환되기 때문에 숫자를 입력받아도 문자열로 읽힘
//			ArrayList<Integer> list = new ArrayList<>();
//			
//			// 한 줄씩 정수 입력 받아서 리스트에 추가
//			for (int i = 0; i < n; i++) {
//				list.add(Integer.parseInt(br.readLine()));
//				// 그 문자열을 "정수(int)"로 변환하여 리스트에 추가
//				// parseInt - 입력값이 숫자라는 걸 확신할 수 있을 때만 쓰는 게 안전
//			}
//			
//			Collections.sort(list);
//			
//			// 리스트의 값을 한 줄씩 StringBuilder에 저장
//			for(int value : list) {
//			    sb.append(value).append('\n');
//			}
//			System.out.println(sb);
//
//		}
/* ---------------------------------------------------------------------------- */
//		# baekjoon 14681
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		
//		if (x > 0 && y > 0) System.out.println("1");
//		else if (x < 0 && y > 0) System.out.println("2");
//		else if (x < 0 && y < 0) System.out.println("3");
//		else System.out.println("4");
/* ---------------------------------------------------------------------------- */
//		# baekjoon 27866
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		int i = sc.nextInt();
//		
//		char ch = s.charAt(i-1);
//		System.out.println(ch);
/* ---------------------------------------------------------------------------- */
//		# baekjoon 2743
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		
//		System.out.println(s.length());
/* ---------------------------------------------------------------------------- */
//		# baekjoon 1156
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		
//		StringTokenizer token = new StringTokenizer(str, " ");
//		System.out.println(token.countTokens());
/* ---------------------------------------------------------------------------- */
//		# baekjoon 3052
//		Scanner sc = new Scanner(System.in);
//		Set set = new HashSet<>();
//		// 10개 입력 받음
//		for (int i = 0; i < 10; i++) {
//			set.add(sc.nextInt() % 42);
//		}
//		System.out.println(set.size());
/* ---------------------------------------------------------------------------- */
//		# baekjoon 10813
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		int[] arr = new int[n+1];
//		
//		for (int i = 1; i <= n; i++) {
//			arr[i] = i;
//		}
//		
//		for (int j = 1; j <= m; j++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			
//			int temp = arr[a];
//			arr[a] = arr[b];
//			arr[b] = temp;
//			
//		}
//		
//		for (int i = 1; i <= n; i++) {
//			System.out.print(arr[i] + " ");
//		}
/* ---------------------------------------------------------------------------- */
//		# baekjoon 1292
//		Scanner sc = new Scanner(System.in);
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		int sum = 0;
//		// [1 2 2 3 3 3 4 4 4 4 5 5 ...]
//		//  0 1 2 3 4 5 6 7 8 ...
//		for (int i = 1; i <= 1000; i++) {
//			for (int j = 1; j <= i; j++) {
//				list.add(i);
//			}
//		}
//		for(int i = a-1; i <= b-1; i++) {
//            sum += list.get(i);
//        }
//		System.out.println(sum);
/* ---------------------------------------------------------------------------- */
//		# baekjoon 11653
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		for (int i = 2; i*i <= n; i++) {
//			while (n % i == 0) {
//				System.out.println(i);
//				n /= i;
//			}	
//		}
//		
//		if (n > 1) {
//			System.out.println(n);
//		}
/* ---------------------------------------------------------------------------- */
//		# baekjoon 1110
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt(); // 처음 값
//		int cnum = num; // 저장 값
//		int cycle = 0; // 사이클
//		
//		do {
//			int sum = (num / 10 + num % 10);
//			num = (num % 10) * 10 + (sum % 10);
//			cycle++;
//		} while (num != cnum);
//		
//		System.out.println(cycle);
/* ---------------------------------------------------------------------------- */
//		class Solution {
//		    public int[] solution(long n) {
//		        
//		        String str = Long.toString(n);
//		        int[] answer = {};
//		        int[] result = new int[str.length];
//		        
//		        for (int i = 0; i < answer.length; i++) {
//		            result[i] = answer[answer.length -1 -i];
//		        }
//		        
//		        return answer;
//		    }
//		}
/* ---------------------------------------------------------------------------- */
//		# baekjoon 9506
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			int n = sc.nextInt();
//			if (n == -1) break;
//			
//			int sum = 0;
//			List<Integer> list = new ArrayList<>();
//			
//			for (int i = 1; i < n; i++) {
//				if (n % i == 0) {
//					sum += i;
//					list.add(i);
//				}	
//			}
//			if (sum == n) { // 완전수 일때
//				System.out.print(n + " = ");
//				for (int i = 0; i < list.size(); i++) {
//		            System.out.print(list.get(i));
//		            if (i != list.size() - 1) System.out.print(" + ");
//		        }
//		        System.out.println();
//				
//			} else { // 완전수가 아님
//				System.out.println(n + " is NOT perfect.");
//			}
//		} // while
/* ---------------------------------------------------------------------------- */
//		# baekjoon 10989
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		int n = Integer.parseInt(br.readLine());
//		int[] arr = new int[n];
//		
//		for (int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		
//		Arrays.sort(arr);
//		
//		for (int i = 0; i < n; i++) {
//			sb.append(arr[i]).append("\n");
//		}
//		System.out.print(sb);
/* ---------------------------------------------------------------------------- */
//		# baekjoon 1181
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		HashSet<String> set = new HashSet<>();
//		
//		for (int i = 0; i < n; i++) {
//			set.add(br.readLine());
//		}
//		
//		List<String> list = new ArrayList<>(set);
//		// 길이가 짧은것 부터		
//		// 길이가 같으면 사전 순으로
//		Collections.sort(list, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				if (o1.length() != o2.length()) return o1.length() - o2.length();
//				else return o1.compareTo(o2);
//			}
//		});
//		
//		for (String str : list) {
//			System.out.println(str);
//		}
		
		// Comparator 재구현
//        list.sort((n1, n2) -> {
//            // 길이가 다르다면 길이 순으로
//            if(n1.length() != n2.length()) {
//                return n1.length() - n2.length();
//            }
//            // 아니면 사전 순으로 정렬
//            return n1.compareTo(n2);
//        });
//
//        for(String l: list) {
//            sb.append(l).append('\n');
//        }
//        System.out.println(sb);
/* ---------------------------------------------------------------------------- */
//		# baekjoon 10828
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		int n = Integer.parseInt(br.readLine());
//		Stack<Integer> stack = new Stack<>();
//		
//		for (int i = 0; i < n; i++) {
//			String str = br.readLine();
//			
//			// push 3
//			if (str.startsWith("push")) {
//				int x = Integer.parseInt(str.split(" ")[1]); // 정수 추출
//				stack.push(x);
//			 
//			// pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력
//			// 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력
//			} else if (str.equals("pop")) {
//				if (stack.empty()) {
//					sb.append(-1).append("\n");
//				} else {
//					sb.append(stack.pop()).append("\n");
//				}
//			} else if (str.equals("size")) {
//				sb.append(stack.size()).append("\n");
//				
//			// empty: 스택이 비어있으면 1, 아니면 0을 출력
//			} else if (str.equals("empty")) {
//				if (stack.empty()) sb.append(1).append("\n");
//				else sb.append(0).append("\n");
//
//			// top: 스택의 가장 위에 있는 정수를 출력
//			// 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력
//			} else if (str.equals("top")) {
//				if (stack.empty()) sb.append(-1).append("\n");
//				else sb.append(stack.peek()).append("\n");
//			} 
//		}
//		System.out.println(sb);
/* ---------------------------------------------------------------------------- */
//		# baekjoon 1427
//		Scanner sc = new Scanner(System.in);
//		char[] arr = sc.next().toCharArray();
//		
//		Arrays.sort(arr);
//		
//		for (int i = arr.length-1; i >= 0; i--) {
//			System.out.print(arr[i]);
//		}	
/* ---------------------------------------------------------------------------- */
//		# baekjoon 14425
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		int n = Integer.parseInt(st.nextToken());
//		int m = Integer.parseInt(st.nextToken());
//		
//		HashSet<String> set = new HashSet<String>();
//	
//		for (int i = 0; i < n; i++) {
//			set.add(br.readLine());
//		}
//		int count = 0;	
//		for (int i = 0; i < m; i++) {
//			if (set.contains(br.readLine())) count++;
//		}
//		System.out.println(count);
/* ---------------------------------------------------------------------------- */
//		# baekjoon 11650
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		int[][] arr = new int[n][2];  // arr[i][0] = x, arr[i][1] = y
//
//		
//		for (int i = 0; i < n; i++) {
//			String[] str = br.readLine().split(" ");
//			arr[i][0] = Integer.parseInt(str[0]);
//			arr[i][1] = Integer.parseInt(str[1]);
//		}
//		
//		Arrays.sort(arr, new Comparator<int[]>() {
//			@Override
//			public int compare(int[] x, int[] y) {
//				// 첫번째 원소의 값이 같을 때 두번쨰 원소의 값을 기준으로 정렬
//				if (x[0] == y[0]) return x[1] - y[1];
//				// 같지 않을 시 첫번째 원소를 기준으로 정렬
//				else return x[0] - y[0];
//			}
//		});
//		
//		for (int i = 0; i < n; i++) {
//			System.out.println(arr[i][0] + " " + arr[i][1]);
//		}
/* ---------------------------------------------------------------------------- */
//		# baekjoon 7785
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<String>(n);

		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			
			String name = str[0];
			String log = str[1];
			
			if (log.equals("enter")) set.add(name);
			else set.remove(name);
		}
		
		ArrayList<String> arrList = new ArrayList<>(set);
		arrList.sort(Comparator.reverseOrder());
		
		for (String result : arrList) {
			System.out.println(result);
		}
		
/* ---------------------------------------------------------------------------- */
/* ---------------------------------------------------------------------------- */
//		# baekjoon 10818
//		# baekjoon 10818
		
		
	} // main
}