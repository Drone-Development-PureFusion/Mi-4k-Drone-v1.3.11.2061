.class public Lcom/google/android/contextmanager/interest/InterestRecordStub;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/contextmanager/interest/InterestRecordStub;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Lcom/google/android/gms/internal/qf$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/contextmanager/interest/a;

    invoke-direct {v0}, Lcom/google/android/contextmanager/interest/a;-><init>()V

    sput-object v0, Lcom/google/android/contextmanager/interest/InterestRecordStub;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(I[B)V
    .locals 4

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/contextmanager/interest/InterestRecordStub;->a:I

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p2}, Lcom/google/android/gms/internal/qf$b;->a([B)Lcom/google/android/gms/internal/qf$b;
    :try_end_0
    .catch Lcom/google/android/gms/internal/rc; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/android/contextmanager/interest/InterestRecordStub;->b:Lcom/google/android/gms/internal/qf$b;

    return-void

    :catch_0
    move-exception v1

    const-string v2, "InterestRecordStub"

    const-string v3, "Could not deserialize interest bytes."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/contextmanager/interest/InterestRecordStub;->a:I

    return v0
.end method

.method b()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/contextmanager/interest/InterestRecordStub;->b:Lcom/google/android/gms/internal/qf$b;

    invoke-static {v0}, Lcom/google/android/gms/internal/rd;->a(Lcom/google/android/gms/internal/rd;)[B

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/contextmanager/interest/a;->a(Lcom/google/android/contextmanager/interest/InterestRecordStub;Landroid/os/Parcel;I)V

    return-void
.end method
