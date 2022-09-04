.class Lcom/google/firebase/database/connection/idl/HostInfoParcelable;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/firebase/database/connection/idl/d;


# instance fields
.field final a:I

.field final b:Ljava/lang/String;

.field final c:Ljava/lang/String;

.field final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/database/connection/idl/d;

    invoke-direct {v0}, Lcom/google/firebase/database/connection/idl/d;-><init>()V

    sput-object v0, Lcom/google/firebase/database/connection/idl/HostInfoParcelable;->CREATOR:Lcom/google/firebase/database/connection/idl/d;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/firebase/database/connection/idl/HostInfoParcelable;->a:I

    iput-object p2, p0, Lcom/google/firebase/database/connection/idl/HostInfoParcelable;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/database/connection/idl/HostInfoParcelable;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/firebase/database/connection/idl/HostInfoParcelable;->d:Z

    return-void
.end method

.method public static a(Lcom/google/firebase/database/connection/idl/HostInfoParcelable;)Lcom/google/android/gms/internal/hp;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/hp;

    iget-object v1, p0, Lcom/google/firebase/database/connection/idl/HostInfoParcelable;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/database/connection/idl/HostInfoParcelable;->c:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/google/firebase/database/connection/idl/HostInfoParcelable;->d:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/hp;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/hp;)Lcom/google/firebase/database/connection/idl/HostInfoParcelable;
    .locals 5

    new-instance v0, Lcom/google/firebase/database/connection/idl/HostInfoParcelable;

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hp;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hp;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hp;->c()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/firebase/database/connection/idl/HostInfoParcelable;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/database/connection/idl/d;->a(Lcom/google/firebase/database/connection/idl/HostInfoParcelable;Landroid/os/Parcel;I)V

    return-void
.end method
