.class public Lcom/google/firebase/auth/api/model/GetAccountInfoUser;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/firebase/auth/api/model/GetAccountInfoUser;",
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
        a = "localId"
    .end annotation
.end field

.field private c:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "email"
    .end annotation
.end field

.field private d:Z
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "emailVerified"
    .end annotation
.end field

.field private e:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "displayName"
    .end annotation
.end field

.field private f:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "photoUrl"
    .end annotation
.end field

.field private g:Lcom/google/firebase/auth/api/model/ProviderUserInfoList;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "providerUserInfo"
    .end annotation
.end field

.field private h:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "passwordHash"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/api/model/b;

    invoke-direct {v0}, Lcom/google/firebase/auth/api/model/b;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->a:I

    new-instance v0, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    invoke-direct {v0}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->g:Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/google/firebase/auth/api/model/ProviderUserInfoList;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->a:I

    iput-object p2, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->d:Z

    iput-object p5, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->f:Ljava/lang/String;

    if-nez p7, :cond_0

    invoke-static {}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->b()Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->g:Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    iput-object p8, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->h:Ljava/lang/String;

    return-void

    :cond_0
    invoke-static {p7}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->a(Lcom/google/firebase/auth/api/model/ProviderUserInfoList;)Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->d:Z

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->f:Ljava/lang/String;

    return-object v0
.end method

.method public f()Landroid/net/Uri;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->h:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/firebase/auth/api/model/ProviderUserInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->g:Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    invoke-virtual {v0}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public i()Lcom/google/firebase/auth/api/model/ProviderUserInfoList;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->g:Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/auth/api/model/b;->a(Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Landroid/os/Parcel;I)V

    return-void
.end method
