.class public final enum Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Feature"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;

.field public static final enum FAIL_ON_UNMATERIALIZED_METHOD:Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;


# instance fields
.field final _defaultState:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x0

    new-instance v0, Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;

    const-string v1, "FAIL_ON_UNMATERIALIZED_METHOD"

    invoke-direct {v0, v1, v2, v2}, Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;->FAIL_ON_UNMATERIALIZED_METHOD:Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;

    const/4 v0, 0x1

    new-array v0, v0, [Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;

    sget-object v1, Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;->FAIL_ON_UNMATERIALIZED_METHOD:Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;

    aput-object v1, v0, v2

    sput-object v0, Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;->$VALUES:[Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;->_defaultState:Z

    return-void
.end method

.method protected static collectDefaults()I
    .locals 6

    const/4 v0, 0x0

    invoke-static {}, Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;->values()[Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;

    move-result-object v2

    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v4, v2, v1

    invoke-virtual {v4}, Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;->enabledByDefault()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;->getMask()I

    move-result v4

    or-int/2addr v0, v4

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;
    .locals 1

    const-class v0, Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;

    return-object v0
.end method

.method public static values()[Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;
    .locals 1

    sget-object v0, Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;->$VALUES:[Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;

    invoke-virtual {v0}, [Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;

    return-object v0
.end method


# virtual methods
.method public enabledByDefault()Z
    .locals 1

    iget-boolean v0, p0, Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;->_defaultState:Z

    return v0
.end method

.method public getMask()I
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lorg/codehaus/jackson/mrbean/AbstractTypeMaterializer$Feature;->ordinal()I

    move-result v1

    shl-int/2addr v0, v1

    return v0
.end method
