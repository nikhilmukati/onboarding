package org.amdocs;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class MobileTest {

	@Test
	public void testStartPhotoAppWhenCameraONFunctionNormally() {
		
		//Mocking - creating a dummy Camera object when no original code
		Camera mockedCamera = Mockito.mock ( Camera.class );
		
		//Stubbing - hard coding the response of dependent method
		Mockito.when(mockedCamera.on()).thenReturn(true);
		
		//Dependency Injection
		Mobile mobile =new Mobile(mockedCamera);
		
		boolean actualResponce = mobile.startPhotoApp();
		boolean expectedResponce = true;
		
		assertEquals( expectedResponce, actualResponce );
		
		//Verify the camera.on() method invoking within the startPhotoApp method
		Mockito.verify(mockedCamera, Mockito.times(1)).on();
		
	}

}
