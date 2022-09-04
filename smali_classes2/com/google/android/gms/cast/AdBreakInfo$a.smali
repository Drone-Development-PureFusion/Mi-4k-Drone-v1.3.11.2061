.class public Lcom/google/android/gms/cast/AdBreakInfo$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/AdBreakInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:J


# direct methods
.method public constructor <init>(J)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/cast/AdBreakInfo$a;->a:J

    iput-wide p1, p0, Lcom/google/android/gms/cast/AdBreakInfo$a;->a:J

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/cast/AdBreakInfo;
    .locals 4

    new-instance v0, Lcom/google/android/gms/cast/AdBreakInfo;

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/cast/AdBreakInfo$a;->a:J

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/cast/AdBreakInfo;-><init>(IJ)V

    return-object v0
.end method
