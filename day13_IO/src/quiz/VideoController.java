package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class VideoController extends Video {
	Scanner sc = new Scanner(System.in);
	Map<Integer, Video> videoMap = new HashMap<>();
	int no = 0;
	
	// 추가
	public void addVideo() {
		System.out.print("제목: ");
		title = sc.nextLine();
		System.out.print("카테고리: ");
		category = sc.nextLine();
		this.lend = false;
		
		
		videoMap.put(no++, new Video(title, category));
	}
	
	// 수정
	public void updateVideo() {
		listVideo();
		
		System.out.print("수정할 비디오 번호를 입력하세요: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		if (n < 0 || n >= videoMap.size()) {
            System.out.println("잘못된 번호입니다.\n");
            return;
        }
		
		System.out.print("제목: ");
		title = sc.nextLine();
		System.out.print("카테고리: ");
		category = sc.nextLine();
		System.out.print("대여여부(true/false): ");
		lend = sc.next().equalsIgnoreCase("true");
		sc.nextLine();
		System.out.print("대여자: ");
		lendName = sc.nextLine();
		
		Video video = videoMap.get(n);
		video.setTitle(title);
		video.setCategory(category);
		video.setLend(lend);
		video.setLendName(lendName);
		
    
	}
	
	// 삭제
	public void deleteVideo() {
		listVideo();
		
		System.out.print("삭제할 비디오 번호를 입력하세요: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		if (n < 0 || n >= videoMap.size()) {
            System.out.println("잘못된 번호입니다.\n");
            return;
        }
		
		videoMap.remove(n);
	}
	
	// 대여 (가능하면)
	

	// 출력
	public void listVideo() {

		for (Map.Entry<Integer, Video> entry : videoMap.entrySet()) {
			
			System.out.println(entry.toString());
		}
		
	}
	
	
	
} // class