.class public final Lcom/google/android/gms/location/places/PlaceFilter$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/location/places/PlaceFilter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private a:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private b:Z

.field private c:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/location/places/UserDataType;",
            ">;"
        }
    .end annotation
.end field

.field private d:[Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/location/places/PlaceFilter$a;->a:Ljava/util/Collection;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/location/places/PlaceFilter$a;->b:Z

    iput-object v1, p0, Lcom/google/android/gms/location/places/PlaceFilter$a;->c:Ljava/util/Collection;

    iput-object v1, p0, Lcom/google/android/gms/location/places/PlaceFilter$a;->d:[Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/location/places/PlaceFilter$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/PlaceFilter$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/location/places/PlaceFilter;
    .locals 3

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/location/places/PlaceFilter;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v1, v2, v2}, Lcom/google/android/gms/location/places/PlaceFilter;-><init>(Ljava/util/Collection;ZLjava/util/Collection;Ljava/util/Collection;)V

    return-object v0
.end method
