.class public Lcom/google/firebase/auth/api/model/ProviderUserInfoList;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/firebase/auth/api/model/ProviderUserInfoList;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/firebase/auth/api/model/ProviderUserInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/api/model/f;

    invoke-direct {v0}, Lcom/google/firebase/auth/api/model/f;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->a:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->b:Ljava/util/List;

    return-void
.end method

.method constructor <init>(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/google/firebase/auth/api/model/ProviderUserInfo;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->a:I

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->b:Ljava/util/List;

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->b:Ljava/util/List;

    goto :goto_0
.end method

.method public static a(Lcom/google/firebase/auth/api/model/ProviderUserInfoList;)Lcom/google/firebase/auth/api/model/ProviderUserInfoList;
    .locals 3

    invoke-virtual {p0}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->a()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    invoke-direct {v1}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;-><init>()V

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v1
.end method

.method public static b()Lcom/google/firebase/auth/api/model/ProviderUserInfoList;
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    invoke-direct {v0}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/firebase/auth/api/model/ProviderUserInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->b:Ljava/util/List;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/auth/api/model/f;->a(Lcom/google/firebase/auth/api/model/ProviderUserInfoList;Landroid/os/Parcel;I)V

    return-void
.end method
