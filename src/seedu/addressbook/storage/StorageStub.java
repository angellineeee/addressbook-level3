package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

public class StorageStub extends Storage{

	public final String path;
	
	public StorageStub(String path) {
		this.path = path;
	}
	
	@Override
	public void save(AddressBook book) throws StorageOperationException {
		//do nothing
	}

	@Override
	public AddressBook load() throws StorageOperationException {
		return new AddressBook();
	}

	@Override
	public String getPath() {
		return path;
	}

}
