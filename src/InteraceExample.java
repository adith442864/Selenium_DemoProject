
public class InteraceExample {

	public static void main(String[] args) {
		
		Browser obj = new Firefox();
		obj.openUrl();
		obj.refresh();
		obj.bookMark();
		obj.quit();
		
		MyCustomeBrowser obj1 = new Safari();
		Browser obj2 = new Safari();

	}

}


abstract class MyCustomeBrowser implements Browser {
	//This can have both implemented and unimplemented methods
	public void openUrl() {
		
	}
}

class Safari extends MyCustomeBrowser {

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookMark() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}
	
}

interface Browser {
	public void openUrl();
	public void refresh();
	public void bookMark();
	public void quit();
}

class Firefox implements Browser {
	
	public void openUrl() {
		
	}
	
	public void refresh() {
		
	}

	@Override
	public void bookMark() {
		
	}

	@Override
	public void quit() {
		
		
	}
}

class Chrome implements Browser{
	
	public void openUrl() {
		
	}
	
	public void refresh() {
		
	}
	
	public void bookMark() {
		
	}
	
	public void openNewTab() {
		
	}

	@Override
	public void quit() {
		
		
	}
}


class Edge implements Browser {
	
	public void openUrl() {
		
	}

	@Override
	public void refresh() {
		
		
	}

	@Override
	public void bookMark() {
	
		
	}

	@Override
	public void quit() {
		
		
	}
	
}
