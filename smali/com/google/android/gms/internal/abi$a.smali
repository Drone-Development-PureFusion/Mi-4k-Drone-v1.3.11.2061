.class public final Lcom/google/android/gms/internal/abi$a;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/abi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

.field public final b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

.field public final c:Lcom/google/android/gms/internal/xh;

.field public final d:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final e:I

.field public final f:J

.field public final g:J

.field public final h:Lorg/json/JSONObject;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/ads/internal/request/AdResponseParcel;Lcom/google/android/gms/internal/xh;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;IJJLorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/abi$a;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iput-object p2, p0, Lcom/google/android/gms/internal/abi$a;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iput-object p3, p0, Lcom/google/android/gms/internal/abi$a;->c:Lcom/google/android/gms/internal/xh;

    iput-object p4, p0, Lcom/google/android/gms/internal/abi$a;->d:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iput p5, p0, Lcom/google/android/gms/internal/abi$a;->e:I

    iput-wide p6, p0, Lcom/google/android/gms/internal/abi$a;->f:J

    iput-wide p8, p0, Lcom/google/android/gms/internal/abi$a;->g:J

    iput-object p10, p0, Lcom/google/android/gms/internal/abi$a;->h:Lorg/json/JSONObject;

    return-void
.end method
