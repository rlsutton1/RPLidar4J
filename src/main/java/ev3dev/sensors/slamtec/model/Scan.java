package ev3dev.sensors.slamtec.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Getter;

/**
 * Scan is the object returned by any RPLidar provider. Internally, the class
 * store information about the distances.
 *
 */
public class Scan
{

	@Getter
	private final List<ScanDistance> distances;

	long startTime;

	long endTime;

	/**
	 * Constructor. Scan object set in the constructor the distances.
	 * 
	 * @param distances
	 */
	public Scan(final List<ScanDistance> distances, long startTime, long endTime)
	{
		this.distances = Collections.synchronizedList(new ArrayList<>());
		this.distances.addAll(distances);
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public long getEndTime()
	{
		return endTime;
	}

	public long getStartTime()
	{
		return startTime;
	}

}
