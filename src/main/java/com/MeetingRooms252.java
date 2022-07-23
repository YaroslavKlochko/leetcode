import com.company.algorithms.dataStructures.Interval;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class MeetingRooms252 {
    public boolean canAttendMeetings(Interval[] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].start;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        for (int i = 0; i < starts.length - 1; i++) {
            if (starts[i + 1] < ends[i]) {
                return false;
            }
        }
        return true;
    }


    public static Boolean canScheduleAll(Collection<RentalTime> rentalTimes) {

        List<Date> startTime = rentalTimes
                .stream()
                .map(RentalTime::getStart)
                .collect(Collectors.toList());

        List<Date> endTime = rentalTimes
                .stream()
                .map(RentalTime::getEnd)
                .collect(Collectors.toList());

        Collections.sort(startTime);
        Collections.sort(endTime);

        for (int i = 0; i < startTime.size() - 1; i++) {
            if (startTime.get(i).getDate() < (endTime.get(i).getDate())) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

        List<RentalTime> rentalTimes = new ArrayList<RentalTime>();
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 19:00"), sdf.parse("03/05/2020 20:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 22:10"), sdf.parse("03/05/2020 22:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 20:30"), sdf.parse("03/05/2020 22:00")));

        System.out.println(MeetingRooms252.canScheduleAll(rentalTimes));
    }


}




