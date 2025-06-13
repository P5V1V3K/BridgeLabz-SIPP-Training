
public class VolumeOfEarth {

	public static void main(String[] args) {
		int radiusInKM=6378;
		float volumeInKM=(4f/3f)*(22f/7f)*radiusInKM*radiusInKM*radiusInKM;
		float radiusInMiles=radiusInKM*1.6f;
		float volumeInMiles=(4f/3f)*(22f/7f)*radiusInMiles*radiusInMiles*radiusInMiles;
		System.out.println("The volume of earth in cubic kilometers is "+
		volumeInKM+" and cubic miles is "+volumeInMiles);
	}

}
