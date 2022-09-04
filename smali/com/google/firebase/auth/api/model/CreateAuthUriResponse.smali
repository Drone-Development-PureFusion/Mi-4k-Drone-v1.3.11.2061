.class public Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I
    .annotation runtime Lcom/google/android/gms/internal/gc;
    .end annotation
.end field

.field private b:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "authUri"
    .end annotation
.end field

.field private c:Z
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "registered"
    .end annotation
.end field

.field private d:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "providerId"
    .end annotation
.end field

.field private e:Z
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "forExistingProvider"
    .end annotation
.end field

.field private f:Lcom/google/firebase/auth/api/model/StringList;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "allProviders"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/api/model/a;

    invoke-direct {v0}, Lcom/google/firebase/auth/api/model/a;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->a:I

    invoke-static {}, Lcom/google/firebase/auth/api/model/StringList;->b()Lcom/google/firebase/auth/api/model/StringList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->f:Lcom/google/firebase/auth/api/model/StringList;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;ZLjava/lang/String;ZLcom/google/firebase/auth/api/model/StringList;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->a:I

    iput-object p2, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->c:Z

    iput-object p4, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->d:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->e:Z

    if-nez p6, :cond_0

    invoke-static {}, Lcom/google/firebase/auth/api/model/StringList;->b()Lcom/google/firebase/auth/api/model/StringList;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->f:Lcom/google/firebase/auth/api/model/StringList;

    return-void

    :cond_0
    invoke-static {p6}, Lcom/google/firebase/auth/api/model/StringList;->a(Lcom/google/firebase/auth/api/model/StringList;)Lcom/google/firebase/auth/api/model/StringList;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->c:Z

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->e:Z

    return v0
.end method

.method public e()Lcom/google/firebase/auth/api/model/StringList;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->f:Lcom/google/firebase/auth/api/model/StringList;

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->f:Lcom/google/firebase/auth/api/model/StringList;

    invoke-virtual {v0}, Lcom/google/firebase/auth/api/model/StringList;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/auth/api/model/a;->a(Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;Landroid/os/Parcel;I)V

    return-void
.end method
