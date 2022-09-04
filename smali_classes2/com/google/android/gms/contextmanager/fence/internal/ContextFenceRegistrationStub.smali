.class public Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private c:Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/f;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/fence/internal/f;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;->a:I

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;->c:Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;)V
    .locals 3

    const/4 v1, 0x1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    invoke-direct {p0, v1, v2, v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;-><init>(ILjava/lang/String;Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;-><init>(Ljava/lang/String;Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;)V

    return-object v0
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;->a:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;->c:Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/fence/internal/f;->a(Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;Landroid/os/Parcel;I)V

    return-void
.end method
