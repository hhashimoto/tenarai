#%%
class TestResult:
    def __init__(self):
        self.runCount = 0

    def testStarted(self):
        self.runCount += 1

    def summary(self):
        return f'{self.runCount} run, 0 failed'

class TestCase:
    def __init__(self, name):
        self.name = name

    def run(self):
        result = TestResult()
        result.testStarted()
        self.setUp()
        method = getattr(self, self.name)
        method()
        self.tearDown()
        return result

    def setUp(self):
        pass

    def tearDown(self):
        pass

class WasRun(TestCase):
    def testMethod(self):
        self.log = self.log + 'testMethod '

    def setUp(self):
        self.log = 'setUp '

    def tearDown(self):
        self.log = self.log + 'tearDown '

class TestCaseTest(TestCase):
    def testTemplateMethod(self):
        test = WasRun('testMethod')
        test.run()
        assert('setUp testMethod tearDown ' == test.log)

    def testResult(self):
        test = WasRun('testMethod')
        result = test.run()
        assert('1 run, 0 failed' == result.summary())

TestCaseTest('testTemplateMethod').run()
TestCaseTest('testResult').run()

# %%
