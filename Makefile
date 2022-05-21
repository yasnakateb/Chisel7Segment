SBT = sbt

# Run the tests
seven-segment:
	$(SBT) "runMain SevenSegmentMain"

seven-segment-test:
	$(SBT) "testOnly SevenSegmentTest"