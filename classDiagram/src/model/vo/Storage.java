package model.vo;

public class Storage {
	private String storageName;
	private String storageAdderess;
	private String storagePhone;
	
	public Storage() {}
	
	public Storage(String storageName, String storageAdderess, String storagePhone) {
		super();
		this.storageName = storageName;
		this.storageAdderess = storageAdderess;
		this.storagePhone = storagePhone;
	}

	public String getStorageName() {
		return storageName;
	}

	public void setStorageName(String storageName) {
		this.storageName = storageName;
	}

	public String getStorageAdderess() {
		return storageAdderess;
	}

	public void setStorageAdderess(String storageAdderess) {
		this.storageAdderess = storageAdderess;
	}

	public String getStoragePhone() {
		return storagePhone;
	}

	public void setStoragePhone(String storagePhone) {
		this.storagePhone = storagePhone;
	}
	
	
}
