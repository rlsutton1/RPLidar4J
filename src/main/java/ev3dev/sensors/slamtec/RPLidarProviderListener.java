package ev3dev.sensors.slamtec;

import ev3dev.sensors.slamtec.model.Scan;
import ev3dev.sensors.slamtec.service.RpLidarDeviceInfo;
import ev3dev.sensors.slamtec.service.RpLidarHeath;

/**
 * This interface model the event when a Scan finished
 */
public interface RPLidarProviderListener
{

	void scanFinished(Scan scan);

	void deviceInfo(RpLidarDeviceInfo info);

	void deviceHealth(RpLidarHeath health);

}
